// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.JobArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.JobState;
import com.pulumi.databricks.outputs.JobCompute;
import com.pulumi.databricks.outputs.JobContinuous;
import com.pulumi.databricks.outputs.JobDbtTask;
import com.pulumi.databricks.outputs.JobEmailNotifications;
import com.pulumi.databricks.outputs.JobGitSource;
import com.pulumi.databricks.outputs.JobJobCluster;
import com.pulumi.databricks.outputs.JobLibrary;
import com.pulumi.databricks.outputs.JobNewCluster;
import com.pulumi.databricks.outputs.JobNotebookTask;
import com.pulumi.databricks.outputs.JobNotificationSettings;
import com.pulumi.databricks.outputs.JobPipelineTask;
import com.pulumi.databricks.outputs.JobPythonWheelTask;
import com.pulumi.databricks.outputs.JobQueue;
import com.pulumi.databricks.outputs.JobRunAs;
import com.pulumi.databricks.outputs.JobSchedule;
import com.pulumi.databricks.outputs.JobSparkJarTask;
import com.pulumi.databricks.outputs.JobSparkPythonTask;
import com.pulumi.databricks.outputs.JobSparkSubmitTask;
import com.pulumi.databricks.outputs.JobTask;
import com.pulumi.databricks.outputs.JobTrigger;
import com.pulumi.databricks.outputs.JobWebhookNotifications;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource job can be imported using the id of the job bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/job:Job this &lt;job-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
     * 
     */
    @Export(name="alwaysRunning", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> alwaysRunning;

    /**
     * @return (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
     * 
     */
    public Output<Optional<Boolean>> alwaysRunning() {
        return Codegen.optional(this.alwaysRunning);
    }
    @Export(name="computes", type=List.class, parameters={JobCompute.class})
    private Output</* @Nullable */ List<JobCompute>> computes;

    public Output<Optional<List<JobCompute>>> computes() {
        return Codegen.optional(this.computes);
    }
    @Export(name="continuous", type=JobContinuous.class, parameters={})
    private Output</* @Nullable */ JobContinuous> continuous;

    public Output<Optional<JobContinuous>> continuous() {
        return Codegen.optional(this.continuous);
    }
    @Export(name="dbtTask", type=JobDbtTask.class, parameters={})
    private Output</* @Nullable */ JobDbtTask> dbtTask;

    public Output<Optional<JobDbtTask>> dbtTask() {
        return Codegen.optional(this.dbtTask);
    }
    /**
     * (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    @Export(name="emailNotifications", type=JobEmailNotifications.class, parameters={})
    private Output</* @Nullable */ JobEmailNotifications> emailNotifications;

    /**
     * @return (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
     * 
     */
    public Output<Optional<JobEmailNotifications>> emailNotifications() {
        return Codegen.optional(this.emailNotifications);
    }
    @Export(name="existingClusterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> existingClusterId;

    public Output<Optional<String>> existingClusterId() {
        return Codegen.optional(this.existingClusterId);
    }
    @Export(name="format", type=String.class, parameters={})
    private Output<String> format;

    public Output<String> format() {
        return this.format;
    }
    @Export(name="gitSource", type=JobGitSource.class, parameters={})
    private Output</* @Nullable */ JobGitSource> gitSource;

    public Output<Optional<JobGitSource>> gitSource() {
        return Codegen.optional(this.gitSource);
    }
    /**
     * A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     * 
     */
    @Export(name="jobClusters", type=List.class, parameters={JobJobCluster.class})
    private Output</* @Nullable */ List<JobJobCluster>> jobClusters;

    /**
     * @return A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
     * 
     */
    public Output<Optional<List<JobJobCluster>>> jobClusters() {
        return Codegen.optional(this.jobClusters);
    }
    /**
     * (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     * 
     */
    @Export(name="libraries", type=List.class, parameters={JobLibrary.class})
    private Output</* @Nullable */ List<JobLibrary>> libraries;

    /**
     * @return (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
     * 
     */
    public Output<Optional<List<JobLibrary>>> libraries() {
        return Codegen.optional(this.libraries);
    }
    /**
     * (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     * 
     */
    @Export(name="maxConcurrentRuns", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxConcurrentRuns;

    /**
     * @return (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
     * 
     */
    public Output<Optional<Integer>> maxConcurrentRuns() {
        return Codegen.optional(this.maxConcurrentRuns);
    }
    /**
     * (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
     * 
     */
    @Export(name="maxRetries", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxRetries;

    /**
     * @return (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
     * 
     */
    public Output<Optional<Integer>> maxRetries() {
        return Codegen.optional(this.maxRetries);
    }
    /**
     * (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    @Export(name="minRetryIntervalMillis", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minRetryIntervalMillis;

    /**
     * @return (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
     * 
     */
    public Output<Optional<Integer>> minRetryIntervalMillis() {
        return Codegen.optional(this.minRetryIntervalMillis);
    }
    /**
     * An optional name for the job. The default value is Untitled.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return An optional name for the job. The default value is Untitled.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Same set of parameters as for databricks.Cluster resource.
     * 
     */
    @Export(name="newCluster", type=JobNewCluster.class, parameters={})
    private Output</* @Nullable */ JobNewCluster> newCluster;

    /**
     * @return Same set of parameters as for databricks.Cluster resource.
     * 
     */
    public Output<Optional<JobNewCluster>> newCluster() {
        return Codegen.optional(this.newCluster);
    }
    @Export(name="notebookTask", type=JobNotebookTask.class, parameters={})
    private Output</* @Nullable */ JobNotebookTask> notebookTask;

    public Output<Optional<JobNotebookTask>> notebookTask() {
        return Codegen.optional(this.notebookTask);
    }
    @Export(name="notificationSettings", type=JobNotificationSettings.class, parameters={})
    private Output</* @Nullable */ JobNotificationSettings> notificationSettings;

    public Output<Optional<JobNotificationSettings>> notificationSettings() {
        return Codegen.optional(this.notificationSettings);
    }
    @Export(name="pipelineTask", type=JobPipelineTask.class, parameters={})
    private Output</* @Nullable */ JobPipelineTask> pipelineTask;

    public Output<Optional<JobPipelineTask>> pipelineTask() {
        return Codegen.optional(this.pipelineTask);
    }
    @Export(name="pythonWheelTask", type=JobPythonWheelTask.class, parameters={})
    private Output</* @Nullable */ JobPythonWheelTask> pythonWheelTask;

    public Output<Optional<JobPythonWheelTask>> pythonWheelTask() {
        return Codegen.optional(this.pythonWheelTask);
    }
    @Export(name="queue", type=JobQueue.class, parameters={})
    private Output</* @Nullable */ JobQueue> queue;

    public Output<Optional<JobQueue>> queue() {
        return Codegen.optional(this.queue);
    }
    /**
     * (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    @Export(name="retryOnTimeout", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> retryOnTimeout;

    /**
     * @return (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
     * 
     */
    public Output<Optional<Boolean>> retryOnTimeout() {
        return Codegen.optional(this.retryOnTimeout);
    }
    @Export(name="runAs", type=JobRunAs.class, parameters={})
    private Output</* @Nullable */ JobRunAs> runAs;

    public Output<Optional<JobRunAs>> runAs() {
        return Codegen.optional(this.runAs);
    }
    /**
     * (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     * 
     */
    @Export(name="schedule", type=JobSchedule.class, parameters={})
    private Output</* @Nullable */ JobSchedule> schedule;

    /**
     * @return (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
     * 
     */
    public Output<Optional<JobSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }
    @Export(name="sparkJarTask", type=JobSparkJarTask.class, parameters={})
    private Output</* @Nullable */ JobSparkJarTask> sparkJarTask;

    public Output<Optional<JobSparkJarTask>> sparkJarTask() {
        return Codegen.optional(this.sparkJarTask);
    }
    @Export(name="sparkPythonTask", type=JobSparkPythonTask.class, parameters={})
    private Output</* @Nullable */ JobSparkPythonTask> sparkPythonTask;

    public Output<Optional<JobSparkPythonTask>> sparkPythonTask() {
        return Codegen.optional(this.sparkPythonTask);
    }
    @Export(name="sparkSubmitTask", type=JobSparkSubmitTask.class, parameters={})
    private Output</* @Nullable */ JobSparkSubmitTask> sparkSubmitTask;

    public Output<Optional<JobSparkSubmitTask>> sparkSubmitTask() {
        return Codegen.optional(this.sparkSubmitTask);
    }
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tasks", type=List.class, parameters={JobTask.class})
    private Output</* @Nullable */ List<JobTask>> tasks;

    public Output<Optional<List<JobTask>>> tasks() {
        return Codegen.optional(this.tasks);
    }
    /**
     * (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    @Export(name="timeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutSeconds;

    /**
     * @return (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
     * 
     */
    public Output<Optional<Integer>> timeoutSeconds() {
        return Codegen.optional(this.timeoutSeconds);
    }
    @Export(name="trigger", type=JobTrigger.class, parameters={})
    private Output</* @Nullable */ JobTrigger> trigger;

    public Output<Optional<JobTrigger>> trigger() {
        return Codegen.optional(this.trigger);
    }
    /**
     * string with URL under the Unity Catalog external location that will be monitored for new files. Please note that have a trailing slash character (`/`).
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return string with URL under the Unity Catalog external location that will be monitored for new files. Please note that have a trailing slash character (`/`).
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    @Export(name="webhookNotifications", type=JobWebhookNotifications.class, parameters={})
    private Output</* @Nullable */ JobWebhookNotifications> webhookNotifications;

    /**
     * @return (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
     * 
     */
    public Output<Optional<JobWebhookNotifications>> webhookNotifications() {
        return Codegen.optional(this.webhookNotifications);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/job:Job", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}
