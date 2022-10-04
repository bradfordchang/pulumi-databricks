// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MwsCustomerManagedKeysAwsKeyInfo {
    /**
     * @return The AWS KMS key alias.
     * 
     */
    private String keyAlias;
    /**
     * @return The AWS KMS key&#39;s Amazon Resource Name (ARN).
     * 
     */
    private String keyArn;
    /**
     * @return (Computed) The AWS region in which KMS key is deployed to. This is not required.
     * 
     */
    private @Nullable String keyRegion;

    private MwsCustomerManagedKeysAwsKeyInfo() {}
    /**
     * @return The AWS KMS key alias.
     * 
     */
    public String keyAlias() {
        return this.keyAlias;
    }
    /**
     * @return The AWS KMS key&#39;s Amazon Resource Name (ARN).
     * 
     */
    public String keyArn() {
        return this.keyArn;
    }
    /**
     * @return (Computed) The AWS region in which KMS key is deployed to. This is not required.
     * 
     */
    public Optional<String> keyRegion() {
        return Optional.ofNullable(this.keyRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsCustomerManagedKeysAwsKeyInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyAlias;
        private String keyArn;
        private @Nullable String keyRegion;
        public Builder() {}
        public Builder(MwsCustomerManagedKeysAwsKeyInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyAlias = defaults.keyAlias;
    	      this.keyArn = defaults.keyArn;
    	      this.keyRegion = defaults.keyRegion;
        }

        @CustomType.Setter
        public Builder keyAlias(String keyAlias) {
            this.keyAlias = Objects.requireNonNull(keyAlias);
            return this;
        }
        @CustomType.Setter
        public Builder keyArn(String keyArn) {
            this.keyArn = Objects.requireNonNull(keyArn);
            return this;
        }
        @CustomType.Setter
        public Builder keyRegion(@Nullable String keyRegion) {
            this.keyRegion = keyRegion;
            return this;
        }
        public MwsCustomerManagedKeysAwsKeyInfo build() {
            final var o = new MwsCustomerManagedKeysAwsKeyInfo();
            o.keyAlias = keyAlias;
            o.keyArn = keyArn;
            o.keyRegion = keyRegion;
            return o;
        }
    }
}