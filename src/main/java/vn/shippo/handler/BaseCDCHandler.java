package vn.shippo.handler;

import org.json.JSONObject;

public abstract class BaseCDCHandler<T> extends BaseHandler<T> {
    protected char _CRUDOperation;
    protected JSONObject _payload;
    protected T _before;
    protected T _after;

    protected void _init() throws NullPointerException {
        _payload = getPayloadFromCDC(_event);
        _CRUDOperation = parseOperator(_payload);
        _mapBeforeAndAfter();
    }

    public static JSONObject getPayloadFromCDC(JSONObject event) throws NullPointerException {
        if (event.isNull("payload")) {
            throw new NullPointerException("Payload is empty");
        }
        return (JSONObject) event.get("payload");
    }

    public static char parseOperator(JSONObject payload) {
        String type = payload.getString("op");
        return type.charAt(0);
    }

    protected void _mapBeforeAndAfter() {
        switch (_CRUDOperation) {
            case 'c': {//create
                _after = mappingEntity((JSONObject) _payload.get("after"));
                if (_after == null) {
                    throw new HandlingException("Can not mapping CDC after data to entity");
                }
                break;
            }
            case 'u': {//update
                _before = mappingEntity((JSONObject) _payload.get("before"));
                _after = mappingEntity((JSONObject) _payload.get("after"));
                if (_after == null) {
                    throw new HandlingException("Can not mapping CDC _after data to entity");
                }

                if (_before == null) {
                    throw new HandlingException("Can not mapping CDC after data to entity");
                }

                break;
            }
        }
    }
}
