package com.elk.common.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
@Data
public class RestConfig {

    public static final RestResult OP_SUCCESS = new RestResult(100000, "success");


    public static RestResult PARAM_CHECKED_FAILURE(String message) {
        return new RestResult(100001, message);
    }

    public static RestResult SERVICE_NOT_EXIST(String message) {
        return new RestResult(100002, message);
    }

    public static final RestResult ONLY_ONE_APARTMENT_SUPPORT = new RestResult(110050, "推送房源需隶属单一公寓");

    public static RestResult WORK_SHEET_CLOSES(String message) {
        return new RestResult(120063, "该工单已经关闭:" + message);
    }
    public static final RestResult DANBAY_BUILD_SUCCESS = new RestResult(120200, "蛋贝房间推送成功");



    public static RestResult ADD_DDING_DISPERSION_ROOMS_FAILURE(String message) {
        return new RestResult(110056, "添加dding房源失败:" + message);
    }

    public static RestResult ROOMS_PAGE(Object page) {
        return new RestResult(120200,page+"");
    }

    public static boolean isSuccess(RestResult RestResult) {
        return RestResult.equals(OP_SUCCESS);
    }


    Door door;

    @Data
    public static class Door {

    }


    @Data
    @AllArgsConstructor
    public static class RestResult {
        int code;
        String message;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RestResult that = (RestResult) o;
            return code == that.code;
        }

        @Override
        public int hashCode() {
            return Objects.hash(code);
        }
    }
}
