// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetClusterClusterInfo;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    private String clusterId;
    /**
     * @return block, consisting of following fields:
     * 
     */
    private GetClusterClusterInfo clusterInfo;
    /**
     * @return Cluster name, which doesn’t have to be unique.
     * 
     */
    private String clusterName;
    /**
     * @return cluster ID
     * 
     */
    private String id;

    private GetClusterResult() {}
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return block, consisting of following fields:
     * 
     */
    public GetClusterClusterInfo clusterInfo() {
        return this.clusterInfo;
    }
    /**
     * @return Cluster name, which doesn’t have to be unique.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return cluster ID
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterId;
        private GetClusterClusterInfo clusterInfo;
        private String clusterName;
        private String id;
        public Builder() {}
        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterInfo = defaults.clusterInfo;
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder clusterInfo(GetClusterClusterInfo clusterInfo) {
            this.clusterInfo = Objects.requireNonNull(clusterInfo);
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetClusterResult build() {
            final var _resultValue = new GetClusterResult();
            _resultValue.clusterId = clusterId;
            _resultValue.clusterInfo = clusterInfo;
            _resultValue.clusterName = clusterName;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
