// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAwsCrossAccountPolicyResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return AWS IAM Policy JSON document
     * 
     */
    private String json;
    private @Nullable List<String> passRoles;

    private GetAwsCrossAccountPolicyResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return AWS IAM Policy JSON document
     * 
     */
    public String json() {
        return this.json;
    }
    public List<String> passRoles() {
        return this.passRoles == null ? List.of() : this.passRoles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsCrossAccountPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String json;
        private @Nullable List<String> passRoles;
        public Builder() {}
        public Builder(GetAwsCrossAccountPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.passRoles = defaults.passRoles;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            this.json = Objects.requireNonNull(json);
            return this;
        }
        @CustomType.Setter
        public Builder passRoles(@Nullable List<String> passRoles) {
            this.passRoles = passRoles;
            return this;
        }
        public Builder passRoles(String... passRoles) {
            return passRoles(List.of(passRoles));
        }
        public GetAwsCrossAccountPolicyResult build() {
            final var o = new GetAwsCrossAccountPolicyResult();
            o.id = id;
            o.json = json;
            o.passRoles = passRoles;
            return o;
        }
    }
}
