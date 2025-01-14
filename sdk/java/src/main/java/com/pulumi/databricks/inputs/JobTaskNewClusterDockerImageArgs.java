// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskNewClusterDockerImageBasicAuthArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskNewClusterDockerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskNewClusterDockerImageArgs Empty = new JobTaskNewClusterDockerImageArgs();

    @Import(name="basicAuth")
    private @Nullable Output<JobTaskNewClusterDockerImageBasicAuthArgs> basicAuth;

    public Optional<Output<JobTaskNewClusterDockerImageBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    /**
     * URL of the job on the given workspace
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL of the job on the given workspace
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private JobTaskNewClusterDockerImageArgs() {}

    private JobTaskNewClusterDockerImageArgs(JobTaskNewClusterDockerImageArgs $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskNewClusterDockerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskNewClusterDockerImageArgs $;

        public Builder() {
            $ = new JobTaskNewClusterDockerImageArgs();
        }

        public Builder(JobTaskNewClusterDockerImageArgs defaults) {
            $ = new JobTaskNewClusterDockerImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable Output<JobTaskNewClusterDockerImageBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder basicAuth(JobTaskNewClusterDockerImageBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        /**
         * @param url URL of the job on the given workspace
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the job on the given workspace
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public JobTaskNewClusterDockerImageArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
