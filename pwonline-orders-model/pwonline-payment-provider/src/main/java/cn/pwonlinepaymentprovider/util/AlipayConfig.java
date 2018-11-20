package cn.pwonlinepaymentprovider.util;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091900548790";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBNRbxzjC0IXir+zezxGTmqlrz+Q1Lxj6TyhFzZBAzuDuFbEEPJISSWKB8mljzvjE1YxU4F7byA+0xBnPyTHrqAN1MflJ1yJ+pR1QNUVHiJPQI15rzgKs4hFPsNn/qjlMyrf4ejY0on3CI/gyA2b9tKIMqumUXh+6gr3qzLfyoKH2adsu/wRxhBMYwaNHN5MQ7qyxMk3J7iXt1+IhPBBEdmacvwnHC/82J7wHK5l+R+N0Rs+O1sgEa6d9FABu0ytVCrA51aU3gmPZQPBHFhBuu+q0Jr4LOOIM198J1mdWFeG8s4MOPiqVXbpU2is5Jo+3zyBJ51FKqd86u0oQjM01zAgMBAAECggEAGIIIcx9IL7K1n/GL1EZpWTNxAxv3gKr+zaujeb6+MAE/EQTCpmun1daHwnrIaptl3BmKOdSNuAQ0pnrx3UDSg7ZcQ5kmbP78AfDsqYYGQR3/R/oVgyCh2ZuIC6Meyk/qyg8kx4jUAKOVhfaiSoKDA+KOVrl6WWdIRSRj4r7TUNXvAL303qltHRCjR+EbQ/sTggN408PBXXeWnmiJJgD2muiJcodQ/w7J5R5wwXywVC3LP8yyyGATSZAuwHOyADuok4E8WX21Id9oY+keZlnkEVoSy7TjOk2gJmKiAL15noKuBqD4n/ZZz6LhvRZKEju1V0fKCtmVj1FT3+ar7X+IYQKBgQDdVSYSAms11wO9wQnuIcg3YRYg1hx14Y4rE/38zlRSYSmP2/0kATL4gaqAOi24wR1zXEhHDzavBeb1hbV8+pzsrEITlEHhERbYlLJbTvB/1MWXUu4Bi5H7/JrvxU0C38gplAUVbxRotN14nOzsxYEZgk06wAZ6GDbzeNbRiNdzAwKBgQCVcfaYUuwDMgMq5fDqhzihQqR5BChrTvsA2ZqrfoBTbNHc0bn8rAl7RDA0DV2cW2NiWDGg8+/9ooV9uGdr1327yv5XACq6UC/hUyNbFFF0CjAOkonCWmCfuvaL+58180I/2Fk2ya48WNPEBv059Ip3TF4Ly0Z0Z9pwokYq/Xd40QKBgQDY5D4gW9pvsjpqUqbGgrhO/IbQusC9C8FjmX3FpPOgnrI51VwlUj9+oqJQcbKoYCXaDE6Pw+rUbLY9Vz/YL0Zj7xH5WcmNIk//AQgeziaDPiA6//tX7EusYYf6+p9S97SQegrZTDb1vHdjYHQUOh8evj+sGMzADMacpIfuYWivvQKBgDWpp3/I/uCi28pSqTC9/5LAaGjgGld2E+GZQdXk5dWPFMizMpLNf9YYhSqbxgp4MnbE7oU6MuojqsWbKt/pkEeXu76n26/tTVQe02pIIHuHkPwamIcGhv20WAWqA+COijJ80IRA5WTcDKauT824xuPRs0+O3ay9Ag5B5upW+8iRAoGAOei3Du6h8NkT0Rfj29ghIC/yMaWNTNI9NU/srx3Ay3AvyesGSXMvlc4O9hAuAT6ck+qzyF5NLaKxxEXMjZeA7Cpx4Dpy1ZFQIROFR5782NqA9p/1LYG3mD5S9p4CNKDi053bOKojeO9fpxgUt6eYMzBnLznBTGBtpy7FWDPs7bo=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxhxbYjOicik5KqAw7Xp0mlvJmt5Y1q9VKGyI4jTCH+h/AIAuU3RAlk1b/KGmOXNJ2rEjzpGeY7VcwNJvS1i935OyFzR2FCBSjJ74hPCasM26K1A6+nagdQOp7yj8dfCT1NXDBeXdf4VTkZWZyoH01f+3NdUSrUoQTBHVToyzKekuYc+npzo6pNIF0pqGVx+hnO34f13iPzD1olPHnYl9zYgWUvIUjoCkl1bBeaPZUlilPBl8mfqXv27cPp/P8pSrcG0uZwQg8asqNcZq/+xZ8EEr30T4oYKhXCyT4IgukubRkISHJQ7zGB175ibIsrhBuGdnMpqHzcgvkG3QS8IV5wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://192.168.50.171:8005/notify_url";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://192.168.50.171:8005/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "https://openapi.alipaydev.com/gateway.do";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {

        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
