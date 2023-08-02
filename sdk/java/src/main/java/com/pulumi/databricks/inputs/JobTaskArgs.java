// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobTaskConditionTaskArgs;
import com.pulumi.databricks.inputs.JobTaskDbtTaskArgs;
import com.pulumi.databricks.inputs.JobTaskDependsOnArgs;
import com.pulumi.databricks.inputs.JobTaskEmailNotificationsArgs;
import com.pulumi.databricks.inputs.JobTaskHealthArgs;
import com.pulumi.databricks.inputs.JobTaskLibraryArgs;
import com.pulumi.databricks.inputs.JobTaskNewClusterArgs;
import com.pulumi.databricks.inputs.JobTaskNotebookTaskArgs;
import com.pulumi.databricks.inputs.JobTaskNotificationSettingsArgs;
import com.pulumi.databricks.inputs.JobTaskPipelineTaskArgs;
import com.pulumi.databricks.inputs.JobTaskPythonWheelTaskArgs;
import com.pulumi.databricks.inputs.JobTaskSparkJarTaskArgs;
import com.pulumi.databricks.inputs.JobTaskSparkPythonTaskArgs;
import com.pulumi.databricks.inputs.JobTaskSparkSubmitTaskArgs;
import com.pulumi.databricks.inputs.JobTaskSqlTaskArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskArgs Empty = new JobTaskArgs();

    @Import(name="computeKey")
    private @Nullable Output<String> computeKey;

    public Optional<Output<String>> computeKey() {
        return Optional.ofNullable(this.computeKey);
    }

    @Import(name="conditionTask")
    private @Nullable Output<JobTaskConditionTaskArgs> conditionTask;

    public Optional<Output<JobTaskConditionTaskArgs>> conditionTask() {
        return Optional.ofNullable(this.conditionTask);
    }

    @Import(name="dbtTask")
    private @Nullable Output<JobTaskDbtTaskArgs> dbtTask;

    public Optional<Output<JobTaskDbtTaskArgs>> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    /**
     * block specifying dependency(-ies) for a given task.
     * 
     */
    @Import(name="dependsOns")
    private @Nullable Output<List<JobTaskDependsOnArgs>> dependsOns;

    /**
     * @return block specifying dependency(-ies) for a given task.
     * 
     */
    public Optional<Output<List<JobTaskDependsOnArgs>>> dependsOns() {
        return Optional.ofNullable(this.dependsOns);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    @Import(name="emailNotifications")
    private @Nullable Output<JobTaskEmailNotificationsArgs> emailNotifications;

    /**
     * @return (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    public Optional<Output<JobTaskEmailNotificationsArgs>> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    @Import(name="existingClusterId")
    private @Nullable Output<String> existingClusterId;

    public Optional<Output<String>> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    /**
     * block described below that specifies health conditions for a given task.
     * 
     */
    @Import(name="health")
    private @Nullable Output<JobTaskHealthArgs> health;

    /**
     * @return block described below that specifies health conditions for a given task.
     * 
     */
    public Optional<Output<JobTaskHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    /**
     * Identifier that can be referenced in `task` block, so that cluster is shared between tasks
     * 
     */
    @Import(name="jobClusterKey")
    private @Nullable Output<String> jobClusterKey;

    /**
     * @return Identifier that can be referenced in `task` block, so that cluster is shared between tasks
     * 
     */
    public Optional<Output<String>> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }

    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     * 
     */
    @Import(name="libraries")
    private @Nullable Output<List<JobTaskLibraryArgs>> libraries;

    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     * 
     */
    public Optional<Output<List<JobTaskLibraryArgs>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
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
     * Same set of parameters as for databricks.Cluster resource.
     * 
     */
    @Import(name="newCluster")
    private @Nullable Output<JobTaskNewClusterArgs> newCluster;

    /**
     * @return Same set of parameters as for databricks.Cluster resource.
     * 
     */
    public Optional<Output<JobTaskNewClusterArgs>> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable Output<JobTaskNotebookTaskArgs> notebookTask;

    public Optional<Output<JobTaskNotebookTaskArgs>> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    /**
     * An optional block controlling the notification settings on the job level (described below).
     * 
     */
    @Import(name="notificationSettings")
    private @Nullable Output<JobTaskNotificationSettingsArgs> notificationSettings;

    /**
     * @return An optional block controlling the notification settings on the job level (described below).
     * 
     */
    public Optional<Output<JobTaskNotificationSettingsArgs>> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    @Import(name="pipelineTask")
    private @Nullable Output<JobTaskPipelineTaskArgs> pipelineTask;

    public Optional<Output<JobTaskPipelineTaskArgs>> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable Output<JobTaskPythonWheelTaskArgs> pythonWheelTask;

    public Optional<Output<JobTaskPythonWheelTaskArgs>> pythonWheelTask() {
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

    @Import(name="runIf")
    private @Nullable Output<String> runIf;

    public Optional<Output<String>> runIf() {
        return Optional.ofNullable(this.runIf);
    }

    @Import(name="sparkJarTask")
    private @Nullable Output<JobTaskSparkJarTaskArgs> sparkJarTask;

    public Optional<Output<JobTaskSparkJarTaskArgs>> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable Output<JobTaskSparkPythonTaskArgs> sparkPythonTask;

    public Optional<Output<JobTaskSparkPythonTaskArgs>> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable Output<JobTaskSparkSubmitTaskArgs> sparkSubmitTask;

    public Optional<Output<JobTaskSparkSubmitTaskArgs>> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    @Import(name="sqlTask")
    private @Nullable Output<JobTaskSqlTaskArgs> sqlTask;

    public Optional<Output<JobTaskSqlTaskArgs>> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }

    /**
     * string specifying an unique key for a given task.
     * * `*_task` - (Required) one of the specific task blocks described below:
     * 
     */
    @Import(name="taskKey")
    private @Nullable Output<String> taskKey;

    /**
     * @return string specifying an unique key for a given task.
     * * `*_task` - (Required) one of the specific task blocks described below:
     * 
     */
    public Optional<Output<String>> taskKey() {
        return Optional.ofNullable(this.taskKey);
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

    private JobTaskArgs() {}

    private JobTaskArgs(JobTaskArgs $) {
        this.computeKey = $.computeKey;
        this.conditionTask = $.conditionTask;
        this.dbtTask = $.dbtTask;
        this.dependsOns = $.dependsOns;
        this.description = $.description;
        this.emailNotifications = $.emailNotifications;
        this.existingClusterId = $.existingClusterId;
        this.health = $.health;
        this.jobClusterKey = $.jobClusterKey;
        this.libraries = $.libraries;
        this.maxRetries = $.maxRetries;
        this.minRetryIntervalMillis = $.minRetryIntervalMillis;
        this.newCluster = $.newCluster;
        this.notebookTask = $.notebookTask;
        this.notificationSettings = $.notificationSettings;
        this.pipelineTask = $.pipelineTask;
        this.pythonWheelTask = $.pythonWheelTask;
        this.retryOnTimeout = $.retryOnTimeout;
        this.runIf = $.runIf;
        this.sparkJarTask = $.sparkJarTask;
        this.sparkPythonTask = $.sparkPythonTask;
        this.sparkSubmitTask = $.sparkSubmitTask;
        this.sqlTask = $.sqlTask;
        this.taskKey = $.taskKey;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskArgs $;

        public Builder() {
            $ = new JobTaskArgs();
        }

        public Builder(JobTaskArgs defaults) {
            $ = new JobTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeKey(@Nullable Output<String> computeKey) {
            $.computeKey = computeKey;
            return this;
        }

        public Builder computeKey(String computeKey) {
            return computeKey(Output.of(computeKey));
        }

        public Builder conditionTask(@Nullable Output<JobTaskConditionTaskArgs> conditionTask) {
            $.conditionTask = conditionTask;
            return this;
        }

        public Builder conditionTask(JobTaskConditionTaskArgs conditionTask) {
            return conditionTask(Output.of(conditionTask));
        }

        public Builder dbtTask(@Nullable Output<JobTaskDbtTaskArgs> dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder dbtTask(JobTaskDbtTaskArgs dbtTask) {
            return dbtTask(Output.of(dbtTask));
        }

        /**
         * @param dependsOns block specifying dependency(-ies) for a given task.
         * 
         * @return builder
         * 
         */
        public Builder dependsOns(@Nullable Output<List<JobTaskDependsOnArgs>> dependsOns) {
            $.dependsOns = dependsOns;
            return this;
        }

        /**
         * @param dependsOns block specifying dependency(-ies) for a given task.
         * 
         * @return builder
         * 
         */
        public Builder dependsOns(List<JobTaskDependsOnArgs> dependsOns) {
            return dependsOns(Output.of(dependsOns));
        }

        /**
         * @param dependsOns block specifying dependency(-ies) for a given task.
         * 
         * @return builder
         * 
         */
        public Builder dependsOns(JobTaskDependsOnArgs... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param emailNotifications (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder emailNotifications(@Nullable Output<JobTaskEmailNotificationsArgs> emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        /**
         * @param emailNotifications (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
         * 
         * @return builder
         * 
         */
        public Builder emailNotifications(JobTaskEmailNotificationsArgs emailNotifications) {
            return emailNotifications(Output.of(emailNotifications));
        }

        public Builder existingClusterId(@Nullable Output<String> existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        public Builder existingClusterId(String existingClusterId) {
            return existingClusterId(Output.of(existingClusterId));
        }

        /**
         * @param health block described below that specifies health conditions for a given task.
         * 
         * @return builder
         * 
         */
        public Builder health(@Nullable Output<JobTaskHealthArgs> health) {
            $.health = health;
            return this;
        }

        /**
         * @param health block described below that specifies health conditions for a given task.
         * 
         * @return builder
         * 
         */
        public Builder health(JobTaskHealthArgs health) {
            return health(Output.of(health));
        }

        /**
         * @param jobClusterKey Identifier that can be referenced in `task` block, so that cluster is shared between tasks
         * 
         * @return builder
         * 
         */
        public Builder jobClusterKey(@Nullable Output<String> jobClusterKey) {
            $.jobClusterKey = jobClusterKey;
            return this;
        }

        /**
         * @param jobClusterKey Identifier that can be referenced in `task` block, so that cluster is shared between tasks
         * 
         * @return builder
         * 
         */
        public Builder jobClusterKey(String jobClusterKey) {
            return jobClusterKey(Output.of(jobClusterKey));
        }

        /**
         * @param libraries (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder libraries(@Nullable Output<List<JobTaskLibraryArgs>> libraries) {
            $.libraries = libraries;
            return this;
        }

        /**
         * @param libraries (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder libraries(List<JobTaskLibraryArgs> libraries) {
            return libraries(Output.of(libraries));
        }

        /**
         * @param libraries (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder libraries(JobTaskLibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }

        /**
         * @param maxRetries (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a `FAILED` or `INTERNAL_ERROR` lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: `PENDING`, `RUNNING`, `TERMINATING`, `TERMINATED`, `SKIPPED` or `INTERNAL_ERROR`.
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
         * @param newCluster Same set of parameters as for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder newCluster(@Nullable Output<JobTaskNewClusterArgs> newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        /**
         * @param newCluster Same set of parameters as for databricks.Cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder newCluster(JobTaskNewClusterArgs newCluster) {
            return newCluster(Output.of(newCluster));
        }

        public Builder notebookTask(@Nullable Output<JobTaskNotebookTaskArgs> notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder notebookTask(JobTaskNotebookTaskArgs notebookTask) {
            return notebookTask(Output.of(notebookTask));
        }

        /**
         * @param notificationSettings An optional block controlling the notification settings on the job level (described below).
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(@Nullable Output<JobTaskNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * @param notificationSettings An optional block controlling the notification settings on the job level (described below).
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(JobTaskNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        public Builder pipelineTask(@Nullable Output<JobTaskPipelineTaskArgs> pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pipelineTask(JobTaskPipelineTaskArgs pipelineTask) {
            return pipelineTask(Output.of(pipelineTask));
        }

        public Builder pythonWheelTask(@Nullable Output<JobTaskPythonWheelTaskArgs> pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder pythonWheelTask(JobTaskPythonWheelTaskArgs pythonWheelTask) {
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

        public Builder runIf(@Nullable Output<String> runIf) {
            $.runIf = runIf;
            return this;
        }

        public Builder runIf(String runIf) {
            return runIf(Output.of(runIf));
        }

        public Builder sparkJarTask(@Nullable Output<JobTaskSparkJarTaskArgs> sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkJarTask(JobTaskSparkJarTaskArgs sparkJarTask) {
            return sparkJarTask(Output.of(sparkJarTask));
        }

        public Builder sparkPythonTask(@Nullable Output<JobTaskSparkPythonTaskArgs> sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkPythonTask(JobTaskSparkPythonTaskArgs sparkPythonTask) {
            return sparkPythonTask(Output.of(sparkPythonTask));
        }

        public Builder sparkSubmitTask(@Nullable Output<JobTaskSparkSubmitTaskArgs> sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder sparkSubmitTask(JobTaskSparkSubmitTaskArgs sparkSubmitTask) {
            return sparkSubmitTask(Output.of(sparkSubmitTask));
        }

        public Builder sqlTask(@Nullable Output<JobTaskSqlTaskArgs> sqlTask) {
            $.sqlTask = sqlTask;
            return this;
        }

        public Builder sqlTask(JobTaskSqlTaskArgs sqlTask) {
            return sqlTask(Output.of(sqlTask));
        }

        /**
         * @param taskKey string specifying an unique key for a given task.
         * * `*_task` - (Required) one of the specific task blocks described below:
         * 
         * @return builder
         * 
         */
        public Builder taskKey(@Nullable Output<String> taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        /**
         * @param taskKey string specifying an unique key for a given task.
         * * `*_task` - (Required) one of the specific task blocks described below:
         * 
         * @return builder
         * 
         */
        public Builder taskKey(String taskKey) {
            return taskKey(Output.of(taskKey));
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

        public JobTaskArgs build() {
            return $;
        }
    }

}
