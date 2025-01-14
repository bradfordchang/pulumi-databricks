// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MwsCustomerManagedKeysGcpKeyInfo {
    /**
     * @return The GCP KMS key&#39;s resource name.
     * 
     */
    private String kmsKeyId;

    private MwsCustomerManagedKeysGcpKeyInfo() {}
    /**
     * @return The GCP KMS key&#39;s resource name.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsCustomerManagedKeysGcpKeyInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeyId;
        public Builder() {}
        public Builder(MwsCustomerManagedKeysGcpKeyInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        @CustomType.Setter
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public MwsCustomerManagedKeysGcpKeyInfo build() {
            final var _resultValue = new MwsCustomerManagedKeysGcpKeyInfo();
            _resultValue.kmsKeyId = kmsKeyId;
            return _resultValue;
        }
    }
}
