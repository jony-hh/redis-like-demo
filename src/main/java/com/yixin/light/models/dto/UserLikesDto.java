package com.yixin.light.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLikesDto {
    private String infoId;
    private String likeUserId;
    private Integer status;

}
