// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServicePrincipalResult {
    /**
     * @return Whether service principal is active or not.
     * 
     */
    private Boolean active;
    private String applicationId;
    /**
     * @return Display name of the service principal, e.g. `Foo SPN`.
     * 
     */
    private String displayName;
    /**
     * @return ID of the service principal in an external identity provider.
     * 
     */
    private String externalId;
    /**
     * @return Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
     * 
     */
    private String home;
    /**
     * @return The id of the service principal.
     * 
     */
    private String id;
    /**
     * @return Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
     * 
     */
    private String repos;
    private String spId;

    private GetServicePrincipalResult() {}
    /**
     * @return Whether service principal is active or not.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return Display name of the service principal, e.g. `Foo SPN`.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return ID of the service principal in an external identity provider.
     * 
     */
    public String externalId() {
        return this.externalId;
    }
    /**
     * @return Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
     * 
     */
    public String home() {
        return this.home;
    }
    /**
     * @return The id of the service principal.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
     * 
     */
    public String repos() {
        return this.repos;
    }
    public String spId() {
        return this.spId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicePrincipalResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private String applicationId;
        private String displayName;
        private String externalId;
        private String home;
        private String id;
        private String repos;
        private String spId;
        public Builder() {}
        public Builder(GetServicePrincipalResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.applicationId = defaults.applicationId;
    	      this.displayName = defaults.displayName;
    	      this.externalId = defaults.externalId;
    	      this.home = defaults.home;
    	      this.id = defaults.id;
    	      this.repos = defaults.repos;
    	      this.spId = defaults.spId;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }
        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }
        @CustomType.Setter
        public Builder home(String home) {
            this.home = Objects.requireNonNull(home);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder repos(String repos) {
            this.repos = Objects.requireNonNull(repos);
            return this;
        }
        @CustomType.Setter
        public Builder spId(String spId) {
            this.spId = Objects.requireNonNull(spId);
            return this;
        }
        public GetServicePrincipalResult build() {
            final var o = new GetServicePrincipalResult();
            o.active = active;
            o.applicationId = applicationId;
            o.displayName = displayName;
            o.externalId = externalId;
            o.home = home;
            o.id = id;
            o.repos = repos;
            o.spId = spId;
            return o;
        }
    }
}
