// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MlflowWebhookJobSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final MlflowWebhookJobSpecArgs Empty = new MlflowWebhookJobSpecArgs();

    /**
     * The personal access token used to authorize webhook&#39;s job runs.
     * 
     */
    @Import(name="accessToken", required=true)
    private Output<String> accessToken;

    /**
     * @return The personal access token used to authorize webhook&#39;s job runs.
     * 
     */
    public Output<String> accessToken() {
        return this.accessToken;
    }

    /**
     * ID of the Databricks job that the webhook runs.
     * 
     */
    @Import(name="jobId", required=true)
    private Output<String> jobId;

    /**
     * @return ID of the Databricks job that the webhook runs.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }

    /**
     * URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
     * 
     */
    @Import(name="workspaceUrl")
    private @Nullable Output<String> workspaceUrl;

    /**
     * @return URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
     * 
     */
    public Optional<Output<String>> workspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    private MlflowWebhookJobSpecArgs() {}

    private MlflowWebhookJobSpecArgs(MlflowWebhookJobSpecArgs $) {
        this.accessToken = $.accessToken;
        this.jobId = $.jobId;
        this.workspaceUrl = $.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MlflowWebhookJobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MlflowWebhookJobSpecArgs $;

        public Builder() {
            $ = new MlflowWebhookJobSpecArgs();
        }

        public Builder(MlflowWebhookJobSpecArgs defaults) {
            $ = new MlflowWebhookJobSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The personal access token used to authorize webhook&#39;s job runs.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The personal access token used to authorize webhook&#39;s job runs.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param jobId ID of the Databricks job that the webhook runs.
         * 
         * @return builder
         * 
         */
        public Builder jobId(Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId ID of the Databricks job that the webhook runs.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param workspaceUrl URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(@Nullable Output<String> workspaceUrl) {
            $.workspaceUrl = workspaceUrl;
            return this;
        }

        /**
         * @param workspaceUrl URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(String workspaceUrl) {
            return workspaceUrl(Output.of(workspaceUrl));
        }

        public MlflowWebhookJobSpecArgs build() {
            $.accessToken = Objects.requireNonNull($.accessToken, "expected parameter 'accessToken' to be non-null");
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            return $;
        }
    }

}
