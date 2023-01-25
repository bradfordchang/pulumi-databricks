// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskNotebookTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskNotebookTaskArgs Empty = new JobTaskNotebookTaskArgs();

    /**
     * (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    @Import(name="baseParameters")
    private @Nullable Output<Map<String,Object>> baseParameters;

    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    public Optional<Output<Map<String,Object>>> baseParameters() {
        return Optional.ofNullable(this.baseParameters);
    }

    /**
     * The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    @Import(name="notebookPath", required=true)
    private Output<String> notebookPath;

    /**
     * @return The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    public Output<String> notebookPath() {
        return this.notebookPath;
    }

    /**
     * Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in git_source. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in git_source. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private JobTaskNotebookTaskArgs() {}

    private JobTaskNotebookTaskArgs(JobTaskNotebookTaskArgs $) {
        this.baseParameters = $.baseParameters;
        this.notebookPath = $.notebookPath;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskNotebookTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskNotebookTaskArgs $;

        public Builder() {
            $ = new JobTaskNotebookTaskArgs();
        }

        public Builder(JobTaskNotebookTaskArgs defaults) {
            $ = new JobTaskNotebookTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseParameters (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
         * 
         * @return builder
         * 
         */
        public Builder baseParameters(@Nullable Output<Map<String,Object>> baseParameters) {
            $.baseParameters = baseParameters;
            return this;
        }

        /**
         * @param baseParameters (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
         * 
         * @return builder
         * 
         */
        public Builder baseParameters(Map<String,Object> baseParameters) {
            return baseParameters(Output.of(baseParameters));
        }

        /**
         * @param notebookPath The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder notebookPath(Output<String> notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        /**
         * @param notebookPath The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder notebookPath(String notebookPath) {
            return notebookPath(Output.of(notebookPath));
        }

        /**
         * @param source Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in git_source. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in git_source. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public JobTaskNotebookTaskArgs build() {
            $.notebookPath = Objects.requireNonNull($.notebookPath, "expected parameter 'notebookPath' to be non-null");
            return $;
        }
    }

}
