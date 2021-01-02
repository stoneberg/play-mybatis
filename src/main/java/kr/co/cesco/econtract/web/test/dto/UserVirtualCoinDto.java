package kr.co.cesco.econtract.web.test.dto;

import kr.co.cesco.econtract.web.test.enums.VirtualCoin;
import lombok.Data;

import java.io.Serializable;

public class UserVirtualCoinDto {

    @Data
    public static class UserVirtualCoinReq implements Serializable {
        private static final long serialVersionUID = 1L;
        private Integer id;
        private String username;
        private VirtualCoin virtualCoin;
        private Integer amount;
    }

    @Data
    public static class UserVirtualCoinRes {
        private Integer id;
        private String username;
        private VirtualCoin virtualCoin;
        private Integer amount;
    }

}
