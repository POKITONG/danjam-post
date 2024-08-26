package com.demo.post.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {

    private Long id;
    private String orderId;
    private int totalAmount;

}
