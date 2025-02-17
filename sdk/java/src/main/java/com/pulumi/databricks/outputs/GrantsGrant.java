// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GrantsGrant {
    private String principal;
    private List<String> privileges;

    private GrantsGrant() {}
    public String principal() {
        return this.principal;
    }
    public List<String> privileges() {
        return this.privileges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantsGrant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String principal;
        private List<String> privileges;
        public Builder() {}
        public Builder(GrantsGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.privileges = defaults.privileges;
        }

        @CustomType.Setter
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        @CustomType.Setter
        public Builder privileges(List<String> privileges) {
            this.privileges = Objects.requireNonNull(privileges);
            return this;
        }
        public Builder privileges(String... privileges) {
            return privileges(List.of(privileges));
        }
        public GrantsGrant build() {
            final var _resultValue = new GrantsGrant();
            _resultValue.principal = principal;
            _resultValue.privileges = privileges;
            return _resultValue;
        }
    }
}
