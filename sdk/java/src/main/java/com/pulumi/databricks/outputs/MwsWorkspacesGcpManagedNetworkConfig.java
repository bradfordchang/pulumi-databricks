// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MwsWorkspacesGcpManagedNetworkConfig {
    private String gkeClusterPodIpRange;
    private String gkeClusterServiceIpRange;
    private String subnetCidr;

    private MwsWorkspacesGcpManagedNetworkConfig() {}
    public String gkeClusterPodIpRange() {
        return this.gkeClusterPodIpRange;
    }
    public String gkeClusterServiceIpRange() {
        return this.gkeClusterServiceIpRange;
    }
    public String subnetCidr() {
        return this.subnetCidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesGcpManagedNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gkeClusterPodIpRange;
        private String gkeClusterServiceIpRange;
        private String subnetCidr;
        public Builder() {}
        public Builder(MwsWorkspacesGcpManagedNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterPodIpRange = defaults.gkeClusterPodIpRange;
    	      this.gkeClusterServiceIpRange = defaults.gkeClusterServiceIpRange;
    	      this.subnetCidr = defaults.subnetCidr;
        }

        @CustomType.Setter
        public Builder gkeClusterPodIpRange(String gkeClusterPodIpRange) {
            this.gkeClusterPodIpRange = Objects.requireNonNull(gkeClusterPodIpRange);
            return this;
        }
        @CustomType.Setter
        public Builder gkeClusterServiceIpRange(String gkeClusterServiceIpRange) {
            this.gkeClusterServiceIpRange = Objects.requireNonNull(gkeClusterServiceIpRange);
            return this;
        }
        @CustomType.Setter
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = Objects.requireNonNull(subnetCidr);
            return this;
        }
        public MwsWorkspacesGcpManagedNetworkConfig build() {
            final var _resultValue = new MwsWorkspacesGcpManagedNetworkConfig();
            _resultValue.gkeClusterPodIpRange = gkeClusterPodIpRange;
            _resultValue.gkeClusterServiceIpRange = gkeClusterServiceIpRange;
            _resultValue.subnetCidr = subnetCidr;
            return _resultValue;
        }
    }
}
