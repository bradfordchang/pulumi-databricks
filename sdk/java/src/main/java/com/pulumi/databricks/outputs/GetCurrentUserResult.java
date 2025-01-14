// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCurrentUserResult {
    private String aclPrincipalId;
    private String alphanumeric;
    private String externalId;
    private String home;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String repos;
    private String userName;
    private String workspaceUrl;

    private GetCurrentUserResult() {}
    public String aclPrincipalId() {
        return this.aclPrincipalId;
    }
    public String alphanumeric() {
        return this.alphanumeric;
    }
    public String externalId() {
        return this.externalId;
    }
    public String home() {
        return this.home;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String repos() {
        return this.repos;
    }
    public String userName() {
        return this.userName;
    }
    public String workspaceUrl() {
        return this.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCurrentUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aclPrincipalId;
        private String alphanumeric;
        private String externalId;
        private String home;
        private String id;
        private String repos;
        private String userName;
        private String workspaceUrl;
        public Builder() {}
        public Builder(GetCurrentUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclPrincipalId = defaults.aclPrincipalId;
    	      this.alphanumeric = defaults.alphanumeric;
    	      this.externalId = defaults.externalId;
    	      this.home = defaults.home;
    	      this.id = defaults.id;
    	      this.repos = defaults.repos;
    	      this.userName = defaults.userName;
    	      this.workspaceUrl = defaults.workspaceUrl;
        }

        @CustomType.Setter
        public Builder aclPrincipalId(String aclPrincipalId) {
            this.aclPrincipalId = Objects.requireNonNull(aclPrincipalId);
            return this;
        }
        @CustomType.Setter
        public Builder alphanumeric(String alphanumeric) {
            this.alphanumeric = Objects.requireNonNull(alphanumeric);
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
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        @CustomType.Setter
        public Builder workspaceUrl(String workspaceUrl) {
            this.workspaceUrl = Objects.requireNonNull(workspaceUrl);
            return this;
        }
        public GetCurrentUserResult build() {
            final var _resultValue = new GetCurrentUserResult();
            _resultValue.aclPrincipalId = aclPrincipalId;
            _resultValue.alphanumeric = alphanumeric;
            _resultValue.externalId = externalId;
            _resultValue.home = home;
            _resultValue.id = id;
            _resultValue.repos = repos;
            _resultValue.userName = userName;
            _resultValue.workspaceUrl = workspaceUrl;
            return _resultValue;
        }
    }
}
