package com.elfleaf.framework.consistent;

/**
 * JSONObject返回信息的常量
 */
public interface CJSONObject {
    
    /**key键名status,表示返回处理成功与否的状态**/
    public final static String STATUS_KEY = "status";
    
    /**key键名message用于写入详细的返回信息文本**/
    public final static String MESSAGE_KEY = "message";
    
    /**status=error**/
    public final static String STATUS_ERROR = "error";
    
    /**status=failed**/
    public final static String STATUS_FAILED = "failed";
    
    /**status=success**/
    public final static String STATUS_SUCCESS = "success";
}
