package org.z_v.vhr.model;

/**
 * @ClassName: RespBean
 * @Description:  返回结果的Bean
 * @author: Z_V
 * @date: 2020年09月30日 13:17
 */
public class RespBean {
    private  Integer status;
    private  String msg;
    private Object obj;

    public static RespBean ok(String msg){
        return new RespBean(200, msg, null);
    }
    public static RespBean ok(String msg, Object obj){
        return new RespBean(200, msg, obj);
    }
    public static RespBean error(String msg){
        return new RespBean(500, msg, null);
    }
    public static RespBean error(String msg, Object obj){
        return new RespBean(500, msg, obj);
    }

    public RespBean() {
    }

    public RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}