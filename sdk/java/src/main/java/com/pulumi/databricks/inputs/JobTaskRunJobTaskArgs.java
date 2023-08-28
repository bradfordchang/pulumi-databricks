// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskRunJobTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskRunJobTaskArgs Empty = new JobTaskRunJobTaskArgs();

    /**
     * (String) ID of the job
     * 
     */
    @Import(name="jobId", required=true)
    private Output<Integer> jobId;

    /**
     * @return (String) ID of the job
     * 
     */
    public Output<Integer> jobId() {
        return this.jobId;
    }

    /**
     * (Map) Job parameters for the task
     * 
     */
    @Import(name="jobParameters")
    private @Nullable Output<Map<String,Object>> jobParameters;

    /**
     * @return (Map) Job parameters for the task
     * 
     */
    public Optional<Output<Map<String,Object>>> jobParameters() {
        return Optional.ofNullable(this.jobParameters);
    }

    private JobTaskRunJobTaskArgs() {}

    private JobTaskRunJobTaskArgs(JobTaskRunJobTaskArgs $) {
        this.jobId = $.jobId;
        this.jobParameters = $.jobParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskRunJobTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskRunJobTaskArgs $;

        public Builder() {
            $ = new JobTaskRunJobTaskArgs();
        }

        public Builder(JobTaskRunJobTaskArgs defaults) {
            $ = new JobTaskRunJobTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId (String) ID of the job
         * 
         * @return builder
         * 
         */
        public Builder jobId(Output<Integer> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId (String) ID of the job
         * 
         * @return builder
         * 
         */
        public Builder jobId(Integer jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param jobParameters (Map) Job parameters for the task
         * 
         * @return builder
         * 
         */
        public Builder jobParameters(@Nullable Output<Map<String,Object>> jobParameters) {
            $.jobParameters = jobParameters;
            return this;
        }

        /**
         * @param jobParameters (Map) Job parameters for the task
         * 
         * @return builder
         * 
         */
        public Builder jobParameters(Map<String,Object> jobParameters) {
            return jobParameters(Output.of(jobParameters));
        }

        public JobTaskRunJobTaskArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            return $;
        }
    }

}
