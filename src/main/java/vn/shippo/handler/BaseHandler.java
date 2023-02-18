package vn.shippo.handler;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.json.JSONObject;

import java.io.IOException;

public abstract class BaseHandler<T> implements IHandler {
    protected JSONObject _event;
    protected ConsumerRecord _record;
    protected Class<T> _entityClazz;

    protected T mappingEntity(JSONObject obj) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        try {
            if(obj.toString().equals("null")) return null;
            return mapper.readValue(obj.toString(), _entityClazz);
        } catch (IOException e) {
            return null;
        }
    }
}
