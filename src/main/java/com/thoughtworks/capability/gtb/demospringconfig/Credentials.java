package com.thoughtworks.capability.gtb.demospringconfig;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Credentials {
    private String username;
    private String password;
    private String authMethod;
}
