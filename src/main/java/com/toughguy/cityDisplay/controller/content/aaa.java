package com.toughguy.cityDisplay.controller.content;



import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;





@RequestMapping("/sf")
@RestController
public class aaa {
	
	
	 private static final String QUESTION = "?";

    /*
     * 1.下订单接口
     */
    @RequestMapping("/placeOrder")
    public Object placeOrder(String body) {
        // 请求body体（companyId需赋值appid）
        body = "{\"dContact\":\"王昆\",\"companyId\":\"201905140011909\",\"jContact\":\"顺丰\",\"jTel\":\"111\",\"jMobile\":null,\"jAddress\":\"马甸\",\"dTel\":\"064756935\",\"dMobile\":null,\"dAddress\":\"北京市朝阳区花家地金兴路1号院5号楼1单元202\",\"custid\":\"7551234567\",\"payMethod\":\"0\",\"expressType\":\"1\",\"packagesNo\":\"1\",\"depositumInfo\":\"TCL空调\",\"depositumNo\":\"1\",\"remark\":null,\"isCollection\":\"1\",\"collectionMoney\":\"10.00\",\"isReceipt\":\"0\",\"receipt\":null}";
        // 时间戳
        Long currentTimeMillis = System.currentTimeMillis();
        // 根据 key({appid}_sfkdgj-public-interface) / sk / 时间戳 / 请求body 生成签名
        String sign = genSign("201905140011909_sfkdgj-public-interface", "3a30219b8f09cd23fed09839810c50bd", currentTimeMillis + "", "", body);
        System.out.println("签名 ----》" + sign);

        CloseableHttpClient client = HttpClients.createDefault();
        // 请求下单地址
        HttpPost httpPost = new HttpPost("https://butler-dev-ms.sf-express.com/public/order/v1/placeOrder");
        // sendAppId（sendAppId需赋值appid）
        httpPost.addHeader("sendAppId", "201905140011909");
        // 时间戳需和获取验签时一致
        httpPost.addHeader("timestamp", currentTimeMillis + "");
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
        // 签名
        httpPost.addHeader("sign", sign);
        // 请求body体需和获取验签时一致
        httpPost.setEntity(new StringEntity(body, "utf-8"));
        CloseableHttpResponse response = null;
        String resData= null;
        try {
            response = client.execute(httpPost);
            resData = EntityUtils.toString(response.getEntity(),HTTP.UTF_8);
            System.out.println(resData);
            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("发送post成功");
            }
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("发送post失败");
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return resData;
    }


    /**
     * 3.订单取消接口
     * @param body
     * @return
     */
    @RequestMapping("/cancelOrder")
    public Object cancelOrder(String body) {
        // 请求body体（companyId需赋值appid）
        body = "{\"orderId\":\"a6538540ff3d4d91818b38281c5198f4\",\"companyId\":\"201905140011909\"}";
        // 时间戳
        Long currentTimeMillis = System.currentTimeMillis();
        // 根据 key({appid}_sfkdgj-public-interface) / sk / 时间戳 / 请求body 生成签名
        String sign = genSign("201905140011909_sfkdgj-public-interface", "3a30219b8f09cd23fed09839810c50bd", currentTimeMillis + "", "", body);
        System.out.println("签名 ----》" + sign);

        CloseableHttpClient client = HttpClients.createDefault();
        // 请求下单地址
        HttpPost httpPost = new HttpPost("https://butler-dev-ms.sf-express.com/public/order/v1/cancelOrder");
        // sendAppId（sendAppId需赋值appid）
        httpPost.addHeader("sendAppId", "201905140011909");
        // 时间戳需和获取验签时一致
        httpPost.addHeader("timestamp", currentTimeMillis + "");
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
        // 签名
        httpPost.addHeader("sign", sign);
        // 请求body体需和获取验签时一致
        httpPost.setEntity(new StringEntity(body, "utf-8"));
        CloseableHttpResponse response = null;
        String resData =null;
        try {
            response = client.execute(httpPost);
            resData = EntityUtils.toString(response.getEntity(),HTTP.UTF_8);
            System.out.println(resData);
            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("发送post成功");
            }
        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("发送post失败");
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return resData;
    }
    
    
    /**
     * 4.路由查询接口
     * @param body
     * @return
     */
    @RequestMapping("/listOrderRoute")
    public Object listOrderRoute(String body) {
        // 请求body体（companyId需赋值appid）
        body = "{\"orderId\":\"a6538540ff3d4d91818b38281c5198f4\",\"companyId\":\"201905140011909\"}";
        // 时间戳
        Long currentTimeMillis = System.currentTimeMillis();
        // 根据 key({appid}_sfkdgj-public-interface) / sk / 时间戳 / 请求body 生成签名
        String sign = genSign("201905140011909_sfkdgj-public-interface", "3a30219b8f09cd23fed09839810c50bd", currentTimeMillis + "", "", body);
        System.out.println("签名 ----》" + sign);

        CloseableHttpClient client = HttpClients.createDefault();
        // 请求下单地址
        HttpPost httpPost = new HttpPost("https://butler-dev-ms.sf-express.com/public/order/v1/listOrderRoute");
        // sendAppId（sendAppId需赋值appid）
        httpPost.addHeader("sendAppId", "201905140011909");
        // 时间戳需和获取验签时一致
        httpPost.addHeader("timestamp", currentTimeMillis + "");
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
        // 签名
        httpPost.addHeader("sign", sign);
        // 请求body体需和获取验签时一致
        httpPost.setEntity(new StringEntity(body, "utf-8"));
        CloseableHttpResponse response = null;
        String resData =null;
        try {
            response = client.execute(httpPost);
            resData = EntityUtils.toString(response.getEntity(),HTTP.UTF_8);
            System.out.println(resData);
            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("发送post成功");
            }
        } catch (Exception e) {
            System.out.println("发送post失败");
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return resData;
    }
    
    
    /**
     * 5.订单运费估算接口
     * @param body
     * @return
     */
    @RequestMapping("/getFreight")
    public Object getFreight(String body) {
    	// 请求body体（companyId需赋值appid）
        body = "{\"companyId\": \"201905140011321\",\"jProvince\": \"河南省\",\"jCity\": \"郑州市\", \"jAddress\": \"河南省郑州市新郑机场\", \"dProvince\": \"北京\", \"dCity\": \"北京市\", \"dAddress\": \"北京市朝阳区花家地金兴路1号院5号楼1单元202\", \"expressType\": \"1\",\"parcelWeighs\": \"2.00\",\"volume\": \"10,10,20\"}";
        // 时间戳
        Long currentTimeMillis = System.currentTimeMillis();
        // 根据 key({appid}_sfkdgj-public-interface) / sk / 时间戳 / 请求body 生成签名
        String sign = genSign("201905140011909_sfkdgj-public-interface", "3a30219b8f09cd23fed09839810c50bd", currentTimeMillis + "", "", body);
        System.out.println("签名 ----》" + sign);

        CloseableHttpClient client = HttpClients.createDefault();
        // 请求下单地址
        HttpPost httpPost = new HttpPost("https://butler-dev-ms.sf-express.com/public/order/v1/getFreight");
        // sendAppId（sendAppId需赋值appid）
        httpPost.addHeader("sendAppId", "201905140011909");
        // 时间戳需和获取验签时一致
        httpPost.addHeader("timestamp", currentTimeMillis + "");
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
        // 签名
        httpPost.addHeader("sign", sign);
        // 请求body体需和获取验签时一致
        httpPost.setEntity(new StringEntity(body, "utf-8"));
        CloseableHttpResponse response = null;
        String resData =null;
        try {
            response = client.execute(httpPost);
            resData = EntityUtils.toString(response.getEntity(),HTTP.UTF_8);
            System.out.println(resData);
            if (response.getStatusLine().getStatusCode() == 200) {
                System.out.println("发送post成功");
            }
        } catch (Exception e) {
            System.out.println("发送post失败");
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return resData;
    }
    
    
    
    /**
     * 验签工具
     * @param key
     * @param sk
     * @param timestamp
     * @param queryLine
     * @param body
     * @return
     */
    public static String genSign(String key, String sk, String timestamp, String queryLine, String body) {
        if (StringUtils.isEmpty(sk)) {
            // 如此异常报错无法引用可使用自己项目异常抛出
            Exception e = new Exception();
            System.out.println("sk is null for key " + key);
            e.printStackTrace();//输出异常信息
        }
        if (StringUtils.isEmpty(queryLine)) {
            queryLine = "";
        }
        if (StringUtils.isEmpty(body)) {
            body = "";
        }

        if (queryLine.indexOf(QUESTION) == 0) {
            queryLine = queryLine.substring(1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(queryLine);
        sb.append(body);
        sb.append("&sk=").append(sk);
        sb.append("&timestamp=").append(timestamp);

        byte[] bytes = DigestUtils.sha512(sb.toString());
        return Base64.encodeBase64URLSafeString(bytes);
    }

}
