// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobNewClusterDockerImageBasicAuth;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobNewClusterDockerImage {
    private @Nullable JobNewClusterDockerImageBasicAuth basicAuth;
    /**
     * @return URL of the Git repository to use.
     * 
     */
    private String url;

    private JobNewClusterDockerImage() {}
    public Optional<JobNewClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }
    /**
     * @return URL of the Git repository to use.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterDockerImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobNewClusterDockerImageBasicAuth basicAuth;
        private String url;
        public Builder() {}
        public Builder(JobNewClusterDockerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder basicAuth(@Nullable JobNewClusterDockerImageBasicAuth basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public JobNewClusterDockerImage build() {
            final var o = new JobNewClusterDockerImage();
            o.basicAuth = basicAuth;
            o.url = url;
            return o;
        }
    }
}
