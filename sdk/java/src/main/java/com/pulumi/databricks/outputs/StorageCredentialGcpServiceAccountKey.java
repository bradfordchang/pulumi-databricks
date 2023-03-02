// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageCredentialGcpServiceAccountKey {
    private String email;
    private String privateKey;
    private String privateKeyId;

    private StorageCredentialGcpServiceAccountKey() {}
    public String email() {
        return this.email;
    }
    public String privateKey() {
        return this.privateKey;
    }
    public String privateKeyId() {
        return this.privateKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageCredentialGcpServiceAccountKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String privateKey;
        private String privateKeyId;
        public Builder() {}
        public Builder(StorageCredentialGcpServiceAccountKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyId(String privateKeyId) {
            this.privateKeyId = Objects.requireNonNull(privateKeyId);
            return this;
        }
        public StorageCredentialGcpServiceAccountKey build() {
            final var o = new StorageCredentialGcpServiceAccountKey();
            o.email = email;
            o.privateKey = privateKey;
            o.privateKeyId = privateKeyId;
            return o;
        }
    }
}