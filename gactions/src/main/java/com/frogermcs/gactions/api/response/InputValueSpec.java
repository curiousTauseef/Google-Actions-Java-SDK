package com.frogermcs.gactions.api.response;

import lombok.*;

@Builder
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InputValueSpec {
    public PermissionValueSpec permission_value_spec;
}
