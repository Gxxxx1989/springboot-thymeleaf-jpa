package result;

 

public class CommonResult {

 

    private Integer code;

 

    private String msg;

 

    private Object jsonObj;

 

 

    public CommonResult(Integer code, String msg, Object jsonObj) {

        this.code = code;

        this.msg = msg;

        this.jsonObj = jsonObj;

    }

 

    public Integer getCode() {

        return code;

    }

 

    public void setCode(Integer code) {

        this.code = code;

    }

 

    public String getMsg() {

        return msg;

    }

 

    public void setMsg(String msg) {

        this.msg = msg;

    }

 

    public Object getJsonObj() {

        return jsonObj;

    }

 

    public void setJsonObj(Object jsonObj) {

        this.jsonObj = jsonObj;

    }

}
