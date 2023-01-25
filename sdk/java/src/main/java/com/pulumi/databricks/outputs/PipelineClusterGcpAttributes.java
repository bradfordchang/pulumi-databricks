// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineClusterGcpAttributes {
    private @Nullable String availability;
    private @Nullable String googleServiceAccount;
    private @Nullable String zoneId;

    private PipelineClusterGcpAttributes() {}
    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<String> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineClusterGcpAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availability;
        private @Nullable String googleServiceAccount;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(PipelineClusterGcpAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.googleServiceAccount = defaults.googleServiceAccount;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder availability(@Nullable String availability) {
            this.availability = availability;
            return this;
        }
        @CustomType.Setter
        public Builder googleServiceAccount(@Nullable String googleServiceAccount) {
            this.googleServiceAccount = googleServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public PipelineClusterGcpAttributes build() {
            final var o = new PipelineClusterGcpAttributes();
            o.availability = availability;
            o.googleServiceAccount = googleServiceAccount;
            o.zoneId = zoneId;
            return o;
        }
    }
}
