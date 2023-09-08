package com.yida.test4.encryption;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

/**
 * @author zhangyifei
 * @Date 2023/7/13 14:26
 * @Version 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        String PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAOZ4wOH284OwjdTL7d5E1a1MlXRMOz+aNioFYNuIo2D1sdwcY9EfR/DIcYfaQB1/35buCw+vHIHXqk55/RQ3HnaKEqe8YvZMla8k9pmtOUUS3xxYFTfBhzMX6Sv4Fv+aAuWBNxxWzQ9eDF9k7Ts8tQaB3yQowtnkc4YNF7xUtmjNAgMBAAECgYAA0GL7IHHbrr3tgBBVpxxPF/guKlX8A38PwYtigVZY1RKnxg+QFNQehlgMFkLkNgD+eAC2KlSyMe2cz59vH/u2hs6hD8sTUT18nPd4UFJO1tuaYrnuFz0kZCnuQRLn2iZNiAtbzJJMeXdafXDakPTrSV8dlQH1EP+XMBFXwqolmQJBAP0rYyIDGFh3pKBNvCrjQZyzgROAYWO3G4MPXZSCQuB+KTnLYn2a011dveXyou6t8B3ZdtKbr0BCj5dRDIUWkVkCQQDpDGbCOMpH5U69dqIUQAYLDDd1glSY+Fi9oWaL1VVo06R0ZTuJ44GpcJd2bUT7veLbY+OTrMCzvzYP7qFNaFCVAkEA3ntXdddUeMJDqSBHIUVvLn9NCk9CxrdudQF20oCatuAH6KNEXW9HGgC8ViyhZLD0l7a4xiJMo2Ma/vYZ04demQJAC6VWAUCrQxp/a9Jg2Rg19RlgMBwaNCa88IT/Rd+cTAe/gR2J8yMOWLRKrV1ahCYCDyqXtcp9Or5EallncCHVXQJAMf+7+bdF1ParPHM+txlMtUoKSOxAHsiXmo8bXonJKAr2aBEZXNqEx7SRlTyaxWVlKpRrn9vbVzMJTempCxYYOw==";
        RSA rsa = new RSA(PRIVATE_KEY, null);

        String data = "adb123###阿sddfsdfsccc第三方";

        String s = rsa.encryptHex(StrUtil.bytes(data, CharsetUtil.CHARSET_UTF_8), KeyType.PrivateKey);
        System.out.println("s = " + s);

        System.out.println("-------------------------------------------------");
        String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDmeMDh9vODsI3Uy+3eRNWtTJV0TDs/mjYqBWDbiKNg9bHcHGPRH0fwyHGH2kAdf9+W7gsPrxyB16pOef0UNx52ihKnvGL2TJWvJPaZrTlFEt8cWBU3wYczF+kr+Bb/mgLlgTccVs0PXgxfZO07PLUGgd8kKMLZ5HOGDRe8VLZozQIDAQAB";
        RSA rsa2 = new RSA(null, PUBLIC_KEY);

        String ss = rsa2.decryptStr(s, KeyType.PublicKey);
        System.out.println("str = " + ss);

    }
}
