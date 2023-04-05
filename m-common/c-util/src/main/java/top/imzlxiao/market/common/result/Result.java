package top.imzlxiao.market.common.result;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/*
* @Author: Longxiao Zhang
* @Date: 2023/3/20 15:24
* @Description 响应结果类
*/
@Data
public class Result<T> {

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty("返回消息")
    private String message;

    @ApiModelProperty("返回数据")
    private T data;


    /**
     * 操作成功
     * @param <T>
     * @return
     */
    public static<T> Result<T> ok(){
        return Result.ok(null);
    }
    private static <T> Result<T> ok(T data) {
        return build(data,ResultCodeEnum.SUCCESS);
    }

    /**
     * 操作失败
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(){
        return Result.fail(null);
    }
    private static <T> Result<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }

    /**
     * 返回数据
     * @param data
     * @param <T>
     * @return
     */
    private static <T> Result<T> build(T data) {
        Result<T> result = new Result<T>();
        if(data != null) result.setData(data);
        return result;
    }
    private static <T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
        Result<T> result = build(data);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }


    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }
    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
    public boolean isOk() {
        if(this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue()) {
            return true;
        }
        return false;
    }


}
