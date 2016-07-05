package util;

import org.msgpack.MessagePack;
import org.springframework.util.ObjectUtils;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class SessionUtil extends WebUtils{

    private static final MessagePack globalMessagePack = new MessagePack();

    public static <T> void  setAttribute(HttpServletRequest request, String key, T V) throws IOException {
        setSessionAttribute(request,key,globalMessagePack.write(V));
    }
    public static  <T> T  getAttribute(HttpServletRequest request,String key,Class<T> clazz) throws IOException {
        byte[] bytes = (byte[]) getSessionAttribute(request,key);
        if(ObjectUtils.isEmpty(bytes)){
            return null;
        }
        return globalMessagePack.read(bytes,clazz);
    }
}
