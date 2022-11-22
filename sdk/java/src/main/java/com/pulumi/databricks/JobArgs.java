// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobDbtTaskArgs;
import com.pulumi.databricks.inputs.JobEmailNotificationsArgs;
import com.pulumi.databricks.inputs.JobGitSourceArgs;
import com.pulumi.databricks.inputs.JobJobClusterArgs;
import com.pulumi.databricks.inputs.JobLibraryArgs;
import com.pulumi.databricks.inputs.JobNewClusterArgs;
import com.pulumi.databricks.inputs.JobNotebookTaskArgs;
import com.pulumi.databricks.inputs.JobPipelineTaskArgs;
import com.pulumi.databricks.inputs.JobPythonWheelTaskArgs;
import com.pulumi.databricks.inputs.JobScheduleArgs;
import com.pulumi.databricks.inputs.JobSparkJarTaskArgs;
import com.pulumi.databricks.inputs.JobSparkPythonTaskArgs;
import com.pulumi.databricks.inputs.JobSparkSubmitTaskArgs;
import com.pulumi.databricks.inputs.JobTaskArgs;
import com.pulumi.databricks.inputs.JobWebhookNotificationsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
     * 
     */
    @Import(name="alwaysRunning")
    private @Nullable Output<Boolean> alwaysRunning;

    /**
     * @return (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
     * 
     */
    public Optional<Output<Boolean>> alwaysRunning() {
        return Optional.ofNullable(this.alwaysRunning);
    }

    @Import(name="dbtTask")
    private @Nullable Output<JobDbtTaskArgs> dbtTask;

    public Optional<Output<JobDbtTaskArgs>> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    /**
     * (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    @Import(name="emailNotifications")
    private @Nullable Output<JobEmailNotificationsArgs> emailNotifications;

    /**
     * @return (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    public Optional<Output<JobEmailNotificationsArgs>> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    /**
     * If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `new_cluster` for greater reliability.
     * 
     */
    @Import(name="existingClusterId")
    private @Nullable Output<String> existingClusterId;

    /**
     * @return If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `new_cluster` for greater reliability.
     * 
     */
    public Optional<Output<String>> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    @Import(name="format")
    private @Nullable Output<String> format;

    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    @Import(name="gitSource")
    private @Nullable Output<JobGitSourceArgs> gitSource;

    public Optional<Output<JobGitSourceArgs>> gitSource() {
        return Optional.ofNullable(this.gitSource);
    }

    @Import(name="jobClusters")
    private @Nullable Output<List<JobJobClusterArgs>> jobClusters;

    public Optional<Output<List<JobJobClusterArgs>>> jobClusters() {
        return Optional.ofNullable(this.jobClusters);
    }

    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     * 
     */
    @Import(name="libraries")
    private @Nullable Output<List<JobLibraryArgs>> libraries;

    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     * 
     */
    public Optional<Output<List<JobLibraryArgs>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     * 
     */
    @Import(name="maxConcurrentRuns")
    private @Nullable Output<Integer> maxConcurrentRuns;

    /**
     * @return (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentRuns() {
        return Optional.ofNullable(this.maxConcurrentRuns);
    }

    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED result_state or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED result_state or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    @Import(name="minRetryIntervalMillis")
    private @Nullable Output<Integer> minRetryIntervalMillis;

    /**
     * @return (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    public Optional<Output<Integer>> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }

    /**
     * An optional name for the job. The default value is Untitled.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return An optional name for the job. The default value is Untitled.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Same set of parameters as for databricks.Cluster resource.
     * 
     */
    @Import(name="newCluster")
    private @Nullable Output<JobNewClusterArgs> newCluster;

    /**
     * @return Same set of parameters as for databricks.Cluster resource.
     * 
     */
    public Optional<Output<JobNewClusterArgs>> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable Output<JobNotebookTaskArgs> notebookTask;

    public Optional<Output<JobNotebookTaskArgs>> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    @Import(name="pipelineTask")
    private @Nullable Output<JobPipelineTaskArgs> pipelineTask;

    public Optional<Output<JobPipelineTaskArgs>> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable Output<JobPythonWheelTaskArgs> pythonWheelTask;

    public Optional<Output<JobPythonWheelTaskArgs>> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }

    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    @Import(name="retryOnTimeout")
    private @Nullable Output<Boolean> retryOnTimeout;

    /**
     * @return (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    public Optional<Output<Boolean>> retryOnTimeout() {
        return Optional.ofNullable(this.retryOnTimeout);
    }

    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<JobScheduleArgs> schedule;

    /**
     * @return (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     * 
     */
    public Optional<Output<JobScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    @Import(name="sparkJarTask")
    private @Nullable Output<JobSparkJarTaskArgs> sparkJarTask;

    public Optional<Output<JobSparkJarTaskArgs>> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable Output<JobSparkPythonTaskArgs> sparkPythonTask;

    public Optional<Output<JobSparkPythonTaskArgs>> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable Output<JobSparkSubmitTaskArgs> sparkSubmitTask;

    public Optional<Output<JobSparkSubmitTaskArgs>> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    /**
     * (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tasks")
    private @Nullable Output<List<JobTaskArgs>> tasks;

    public Optional<Output<List<JobTaskArgs>>> tasks() {
        return Optional.ofNullable(this.tasks);
    }

    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    @Import(name="webhookNotifications")
    private @Nullable Output<JobWebhookNotificationsArgs> webhookNotifications;

    public Optional<Output<JobWebhookNotificationsArgs>> webhookNotifications() {
        return Optional.ofNullable(this.webhookNotifications);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.alwaysRunning = $.alwaysRunning;
        this.dbtTask = $.dbtTask;
        this.emailNotifications = $.emailNotifications;
        this.existingClusterId = $.existingClusterId;
        this.format = $.format;
        this.gitSource = $.gitSource;
        this.jobClusters = $.jobClusters;
        this.libraries = $.libraries;
        this.maxConcurrentRuns = $.maxConcurrentRuns;
        this.maxRetries = $.maxRetries;
        this.minRetryIntervalMillis = $.minRetryIntervalMillis;
        this.name = $.name;
        this.newCluster = $.newCluster;
        this.notebookTask = $.notebookTask;
        this.pipelineTask = $.pipelineTask;
        this.pythonWheelTask = $.pythonWheelTask;
        this.retryOnTimeout = $.retryOnTimeout;
        this.schedule = $.schedule;
        this.sparkJarTask = $.sparkJarTask;
        this.sparkPythonTask = $.sparkPythonTask;
        this.sparkSubmitTask = $.sparkSubmitTask;
        this.tags = $.tags;
        this.tasks = $.tasks;
        this.timeoutSeconds = $.timeoutSeconds;
        this.webhookNotifications = $.webhookNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysRunning (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
         * 
         * @return builder
         * 
         */
        public Builder alwaysRunning(@Nullable Output<Boolean> alwaysRunning) {
            $.alwaysRunning = alwaysRunning;
            return this;
        }

        /**
         * @param alwaysRunning (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
         * 
         * @return builder
         * 
         */
        public Builder alwaysRunning(Boolean alwaysRunning) {
            return alwaysRunning(Output.of(alwaysRunning));
        }

        public Builder dbtTask(@Nullable Output<JobDbtTaskArgs> dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder dbtTask(JobDbtTaskArgs dbtTask) {
            return dbtTask(Output.of(dbtTask));
        }

        /**
         * @param emailNotifications (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder emailNotifications(@Nullable Output<JobEmailNotificationsArgs> emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        /**
         * @param emailNotifications (List) An optional set of email addresses notified when runs of this job begin and complete and when this job is deleted. The default behavior is to not send any emails. This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder emailNotifications(JobEmailNotificationsArgs emailNotifications) {
            return emailNotifications(Output.of(emailNotifications));
        }

        /**
         * @param existingClusterId If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `new_cluster` for greater reliability.
         * 
         * @return builder
         * 
         */
        public Builder existingClusterId(@Nullable Output<String> existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        /**
         * @param existingClusterId If existing_cluster_id, the ID of an existing cluster that will be used for all runs of this job. When running jobs on an existing cluster, you may need to manually restart the cluster if it stops responding. We strongly suggest to use `new_cluster` for greater reliability.
         * 
         * @return builder
         * 
         */
        public Builder existingClusterId(String existingClusterId) {
            return existingClusterId(Output.of(existingClusterId));
        }

        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        public Builder format(String format) {
            return format(Output.of(format));
        }

        public Builder gitSource(@Nullable Output<JobGitSourceArgs> gitSource) {
            $.gitSource = gitSource;
            return this;
        }

        public Builder gitSource(JobGitSourceArgs gitSource) {
            return gitSource(Output.of(gitSource));
        }

        public Builder jobClusters(@Nullable Output<List<JobJobClusterArgs>> jobClusters) {
            $.jobClusters = jobClusters;
            return this;
        }

        public Builder jobClusters(List<JobJobClusterArgs> jobClusters) {
            return jobClusters(Output.of(jobClusters));
        }

        public Builder jobClusters(JobJobClusterArgs... jobClusters) {
            return jobClusters(List.of(jobClusters));
        }

        /**
         * @param libraries (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder libraries(@Nullable Output<List<JobLibraryArgs>> libraries) {
            $.libraries = libraries;
            return this;
        }

        /**
         * @param libraries (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder libraries(List<JobLibraryArgs> libraries) {
            return libraries(Output.of(libraries));
        }

        /**
         * @param libraries (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder libraries(JobLibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }

        /**
         * @param maxConcurrentRuns (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentRuns(@Nullable Output<Integer> maxConcurrentRuns) {
            $.maxConcurrentRuns = maxConcurrentRuns;
            return this;
        }

        /**
         * @param maxConcurrentRuns (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentRuns(Integer maxConcurrentRuns) {
            return maxConcurrentRuns(Output.of(maxConcurrentRuns));
        }

        /**
         * @param maxRetries (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED result_state or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED result_state or INTERNAL_ERROR life_cycle_state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param minRetryIntervalMillis (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
         * 
         * @return builder
         * 
         */
        public Builder minRetryIntervalMillis(@Nullable Output<Integer> minRetryIntervalMillis) {
            $.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }

        /**
         * @param minRetryIntervalMillis (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
         * 
         * @return builder
         * 
         */
        public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
            return minRetryIntervalMillis(Output.of(minRetryIntervalMillis));
        }

        /**
         * @param name An optional name for the job. The default value is Untitled.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name An optional name for the job. The default value is Untitled.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param newCluster Same set of parameters as for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder newCluster(@Nullable Output<JobNewClusterArgs> newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        /**
         * @param newCluster Same set of parameters as for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder newCluster(JobNewClusterArgs newCluster) {
            return newCluster(Output.of(newCluster));
        }

        public Builder notebookTask(@Nullable Output<JobNotebookTaskArgs> notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder notebookTask(JobNotebookTaskArgs notebookTask) {
            return notebookTask(Output.of(notebookTask));
        }

        public Builder pipelineTask(@Nullable Output<JobPipelineTaskArgs> pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pipelineTask(JobPipelineTaskArgs pipelineTask) {
            return pipelineTask(Output.of(pipelineTask));
        }

        public Builder pythonWheelTask(@Nullable Output<JobPythonWheelTaskArgs> pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder pythonWheelTask(JobPythonWheelTaskArgs pythonWheelTask) {
            return pythonWheelTask(Output.of(pythonWheelTask));
        }

        /**
         * @param retryOnTimeout (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
         * 
         * @return builder
         * 
         */
        public Builder retryOnTimeout(@Nullable Output<Boolean> retryOnTimeout) {
            $.retryOnTimeout = retryOnTimeout;
            return this;
        }

        /**
         * @param retryOnTimeout (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
         * 
         * @return builder
         * 
         */
        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            return retryOnTimeout(Output.of(retryOnTimeout));
        }

        /**
         * @param schedule (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<JobScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(JobScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder sparkJarTask(@Nullable Output<JobSparkJarTaskArgs> sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkJarTask(JobSparkJarTaskArgs sparkJarTask) {
            return sparkJarTask(Output.of(sparkJarTask));
        }

        public Builder sparkPythonTask(@Nullable Output<JobSparkPythonTaskArgs> sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkPythonTask(JobSparkPythonTaskArgs sparkPythonTask) {
            return sparkPythonTask(Output.of(sparkPythonTask));
        }

        public Builder sparkSubmitTask(@Nullable Output<JobSparkSubmitTaskArgs> sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder sparkSubmitTask(JobSparkSubmitTaskArgs sparkSubmitTask) {
            return sparkSubmitTask(Output.of(sparkSubmitTask));
        }

        /**
         * @param tags (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public Builder tasks(@Nullable Output<List<JobTaskArgs>> tasks) {
            $.tasks = tasks;
            return this;
        }

        public Builder tasks(List<JobTaskArgs> tasks) {
            return tasks(Output.of(tasks));
        }

        public Builder tasks(JobTaskArgs... tasks) {
            return tasks(List.of(tasks));
        }

        /**
         * @param timeoutSeconds (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public Builder webhookNotifications(@Nullable Output<JobWebhookNotificationsArgs> webhookNotifications) {
            $.webhookNotifications = webhookNotifications;
            return this;
        }

        public Builder webhookNotifications(JobWebhookNotificationsArgs webhookNotifications) {
            return webhookNotifications(Output.of(webhookNotifications));
        }

        public JobArgs build() {
            return $;
        }
    }

}
