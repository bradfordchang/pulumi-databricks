// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobNewClusterGcpAttributes {
    private @Nullable String availability;
    private @Nullable Integer bootDiskSize;
    private @Nullable String googleServiceAccount;
    private @Nullable Boolean usePreemptibleExecutors;
    private @Nullable String zoneId;

    private JobNewClusterGcpAttributes() {}
    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<Integer> bootDiskSize() {
        return Optional.ofNullable(this.bootDiskSize);
    }
    public Optional<String> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }
    public Optional<Boolean> usePreemptibleExecutors() {
        return Optional.ofNullable(this.usePreemptibleExecutors);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterGcpAttributes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer bootDiskSize;
        private @Nullable String googleServiceAccount;
        private @Nullable Boolean usePreemptibleExecutors;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(JobNewClusterGcpAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.bootDiskSize = defaults.bootDiskSize;
    	      this.googleServiceAccount = defaults.googleServiceAccount;
    	      this.usePreemptibleExecutors = defaults.usePreemptibleExecutors;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder availability(@Nullable String availability) {
            this.availability = availability;
            return this;
        }
        @CustomType.Setter
        public Builder bootDiskSize(@Nullable Integer bootDiskSize) {
            this.bootDiskSize = bootDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder googleServiceAccount(@Nullable String googleServiceAccount) {
            this.googleServiceAccount = googleServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder usePreemptibleExecutors(@Nullable Boolean usePreemptibleExecutors) {
            this.usePreemptibleExecutors = usePreemptibleExecutors;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public JobNewClusterGcpAttributes build() {
            final var o = new JobNewClusterGcpAttributes();
            o.availability = availability;
            o.bootDiskSize = bootDiskSize;
            o.googleServiceAccount = googleServiceAccount;
            o.usePreemptibleExecutors = usePreemptibleExecutors;
            o.zoneId = zoneId;
            return o;
        }
    }
}
