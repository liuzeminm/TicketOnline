package cn.pwonlineordersprovider.util;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.jboss.logging.Logger;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Map;


public class JavaWebToken {
    private static Logger log = Logger.getLogger(JavaWebToken.class.getClass());





    //该方法使用HS256算法和Secret:bankgl生成signKey
    private static Key getKeyInstance() {
        //We will sign our JavaWebToken with our ApiKey secret
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary("bankgl");
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        return signingKey;
    }

    //使用HS256签名算法和生成的signingKey最终的Token,claims中是有效载荷
    public static String createJavaWebToken(Map<String, Object> claims) {
        return Jwts.builder().setClaims(claims).signWith(io.jsonwebtoken.SignatureAlgorithm.HS256, getKeyInstance()).compact();
    }

    //解析Token，同时也能验证Token，当验证失败返回null
    public static Map<String, Object> parserJavaWebToken(String jwt) {
        try {
            Map<String, Object> jwtClaims = Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(jwt).getBody();
            return jwtClaims;
        } catch (Exception e) {
            log.error("json web 验证失败");
            return null;
        }
    }
}
