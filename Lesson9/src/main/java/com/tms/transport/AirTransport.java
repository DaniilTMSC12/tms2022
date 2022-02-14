package com.tms.transport;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AirTransport extends Transport {
    private int wingspan;
    private int minLengthOfRunway;

    public String getInfo() {
        return super.getInfo() + " Размах крыльев - " + wingspan + " Минимальная длина ВПП - " + minLengthOfRunway;
    }
}
