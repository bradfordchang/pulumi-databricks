// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Import
    /// 
    /// The resource job can be imported using the id of the job bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/job:Job this &lt;job-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/job:Job")]
    public partial class Job : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
        /// </summary>
        [Output("alwaysRunning")]
        public Output<bool?> AlwaysRunning { get; private set; } = null!;

        [Output("continuous")]
        public Output<Outputs.JobContinuous?> Continuous { get; private set; } = null!;

        [Output("dbtTask")]
        public Output<Outputs.JobDbtTask?> DbtTask { get; private set; } = null!;

        /// <summary>
        /// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
        /// </summary>
        [Output("emailNotifications")]
        public Output<Outputs.JobEmailNotifications?> EmailNotifications { get; private set; } = null!;

        [Output("existingClusterId")]
        public Output<string?> ExistingClusterId { get; private set; } = null!;

        [Output("format")]
        public Output<string> Format { get; private set; } = null!;

        [Output("gitSource")]
        public Output<Outputs.JobGitSource?> GitSource { get; private set; } = null!;

        /// <summary>
        /// A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
        /// </summary>
        [Output("jobClusters")]
        public Output<ImmutableArray<Outputs.JobJobCluster>> JobClusters { get; private set; } = null!;

        /// <summary>
        /// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
        /// </summary>
        [Output("libraries")]
        public Output<ImmutableArray<Outputs.JobLibrary>> Libraries { get; private set; } = null!;

        /// <summary>
        /// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
        /// </summary>
        [Output("maxConcurrentRuns")]
        public Output<int?> MaxConcurrentRuns { get; private set; } = null!;

        /// <summary>
        /// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
        /// </summary>
        [Output("maxRetries")]
        public Output<int?> MaxRetries { get; private set; } = null!;

        /// <summary>
        /// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
        /// </summary>
        [Output("minRetryIntervalMillis")]
        public Output<int?> MinRetryIntervalMillis { get; private set; } = null!;

        /// <summary>
        /// An optional name for the job. The default value is Untitled.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Same set of parameters as for databricks.Cluster resource.
        /// </summary>
        [Output("newCluster")]
        public Output<Outputs.JobNewCluster?> NewCluster { get; private set; } = null!;

        [Output("notebookTask")]
        public Output<Outputs.JobNotebookTask?> NotebookTask { get; private set; } = null!;

        [Output("pipelineTask")]
        public Output<Outputs.JobPipelineTask?> PipelineTask { get; private set; } = null!;

        [Output("pythonWheelTask")]
        public Output<Outputs.JobPythonWheelTask?> PythonWheelTask { get; private set; } = null!;

        /// <summary>
        /// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
        /// </summary>
        [Output("retryOnTimeout")]
        public Output<bool?> RetryOnTimeout { get; private set; } = null!;

        /// <summary>
        /// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
        /// </summary>
        [Output("schedule")]
        public Output<Outputs.JobSchedule?> Schedule { get; private set; } = null!;

        [Output("sparkJarTask")]
        public Output<Outputs.JobSparkJarTask?> SparkJarTask { get; private set; } = null!;

        [Output("sparkPythonTask")]
        public Output<Outputs.JobSparkPythonTask?> SparkPythonTask { get; private set; } = null!;

        [Output("sparkSubmitTask")]
        public Output<Outputs.JobSparkSubmitTask?> SparkSubmitTask { get; private set; } = null!;

        /// <summary>
        /// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        [Output("tasks")]
        public Output<ImmutableArray<Outputs.JobTask>> Tasks { get; private set; } = null!;

        /// <summary>
        /// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
        /// </summary>
        [Output("timeoutSeconds")]
        public Output<int?> TimeoutSeconds { get; private set; } = null!;

        /// <summary>
        /// URL of the Git repository to use.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;

        /// <summary>
        /// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
        /// </summary>
        [Output("webhookNotifications")]
        public Output<Outputs.JobWebhookNotifications?> WebhookNotifications { get; private set; } = null!;


        /// <summary>
        /// Create a Job resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Job(string name, JobArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/job:Job", name, args ?? new JobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Job(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/job:Job", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Job resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Job Get(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
        {
            return new Job(name, id, state, options);
        }
    }

    public sealed class JobArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
        /// </summary>
        [Input("alwaysRunning")]
        public Input<bool>? AlwaysRunning { get; set; }

        [Input("continuous")]
        public Input<Inputs.JobContinuousArgs>? Continuous { get; set; }

        [Input("dbtTask")]
        public Input<Inputs.JobDbtTaskArgs>? DbtTask { get; set; }

        /// <summary>
        /// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
        /// </summary>
        [Input("emailNotifications")]
        public Input<Inputs.JobEmailNotificationsArgs>? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public Input<string>? ExistingClusterId { get; set; }

        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("gitSource")]
        public Input<Inputs.JobGitSourceArgs>? GitSource { get; set; }

        [Input("jobClusters")]
        private InputList<Inputs.JobJobClusterArgs>? _jobClusters;

        /// <summary>
        /// A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
        /// </summary>
        public InputList<Inputs.JobJobClusterArgs> JobClusters
        {
            get => _jobClusters ?? (_jobClusters = new InputList<Inputs.JobJobClusterArgs>());
            set => _jobClusters = value;
        }

        [Input("libraries")]
        private InputList<Inputs.JobLibraryArgs>? _libraries;

        /// <summary>
        /// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
        /// </summary>
        public InputList<Inputs.JobLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobLibraryArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
        /// </summary>
        [Input("maxConcurrentRuns")]
        public Input<int>? MaxConcurrentRuns { get; set; }

        /// <summary>
        /// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
        /// </summary>
        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
        /// </summary>
        [Input("minRetryIntervalMillis")]
        public Input<int>? MinRetryIntervalMillis { get; set; }

        /// <summary>
        /// An optional name for the job. The default value is Untitled.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Same set of parameters as for databricks.Cluster resource.
        /// </summary>
        [Input("newCluster")]
        public Input<Inputs.JobNewClusterArgs>? NewCluster { get; set; }

        [Input("notebookTask")]
        public Input<Inputs.JobNotebookTaskArgs>? NotebookTask { get; set; }

        [Input("pipelineTask")]
        public Input<Inputs.JobPipelineTaskArgs>? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Input<Inputs.JobPythonWheelTaskArgs>? PythonWheelTask { get; set; }

        /// <summary>
        /// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
        /// </summary>
        [Input("retryOnTimeout")]
        public Input<bool>? RetryOnTimeout { get; set; }

        /// <summary>
        /// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.JobScheduleArgs>? Schedule { get; set; }

        [Input("sparkJarTask")]
        public Input<Inputs.JobSparkJarTaskArgs>? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Input<Inputs.JobSparkPythonTaskArgs>? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Input<Inputs.JobSparkSubmitTaskArgs>? SparkSubmitTask { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("tasks")]
        private InputList<Inputs.JobTaskArgs>? _tasks;
        public InputList<Inputs.JobTaskArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.JobTaskArgs>());
            set => _tasks = value;
        }

        /// <summary>
        /// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        /// <summary>
        /// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
        /// </summary>
        [Input("webhookNotifications")]
        public Input<Inputs.JobWebhookNotificationsArgs>? WebhookNotifications { get; set; }

        public JobArgs()
        {
        }
        public static new JobArgs Empty => new JobArgs();
    }

    public sealed class JobState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Bool) Whenever the job is always running, like a Spark Streaming application, on every update restart the current active run or start it again, if nothing it is not running. False by default. Any job runs are started with `parameters` specified in `spark_jar_task` or `spark_submit_task` or `spark_python_task` or `notebook_task` blocks.
        /// </summary>
        [Input("alwaysRunning")]
        public Input<bool>? AlwaysRunning { get; set; }

        [Input("continuous")]
        public Input<Inputs.JobContinuousGetArgs>? Continuous { get; set; }

        [Input("dbtTask")]
        public Input<Inputs.JobDbtTaskGetArgs>? DbtTask { get; set; }

        /// <summary>
        /// (List) An optional set of email addresses notified when runs of this job begins, completes and fails. The default behavior is to not send any emails. This field is a block and is documented below.
        /// </summary>
        [Input("emailNotifications")]
        public Input<Inputs.JobEmailNotificationsGetArgs>? EmailNotifications { get; set; }

        [Input("existingClusterId")]
        public Input<string>? ExistingClusterId { get; set; }

        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("gitSource")]
        public Input<Inputs.JobGitSourceGetArgs>? GitSource { get; set; }

        [Input("jobClusters")]
        private InputList<Inputs.JobJobClusterGetArgs>? _jobClusters;

        /// <summary>
        /// A list of job databricks.Cluster specifications that can be shared and reused by tasks of this job. Libraries cannot be declared in a shared job cluster. You must declare dependent libraries in task settings. *Multi-task syntax*
        /// </summary>
        public InputList<Inputs.JobJobClusterGetArgs> JobClusters
        {
            get => _jobClusters ?? (_jobClusters = new InputList<Inputs.JobJobClusterGetArgs>());
            set => _jobClusters = value;
        }

        [Input("libraries")]
        private InputList<Inputs.JobLibraryGetArgs>? _libraries;

        /// <summary>
        /// (Set) An optional list of libraries to be installed on the cluster that will execute the job. Please consult libraries section for databricks.Cluster resource.
        /// </summary>
        public InputList<Inputs.JobLibraryGetArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.JobLibraryGetArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// (Integer) An optional maximum allowed number of concurrent runs of the job. Defaults to *1*.
        /// </summary>
        [Input("maxConcurrentRuns")]
        public Input<int>? MaxConcurrentRuns { get; set; }

        /// <summary>
        /// (Integer) An optional maximum number of times to retry an unsuccessful run. A run is considered to be unsuccessful if it completes with a FAILED or INTERNAL_ERROR lifecycle state. The value -1 means to retry indefinitely and the value 0 means to never retry. The default behavior is to never retry. A run can have the following lifecycle state: PENDING, RUNNING, TERMINATING, TERMINATED, SKIPPED or INTERNAL_ERROR
        /// </summary>
        [Input("maxRetries")]
        public Input<int>? MaxRetries { get; set; }

        /// <summary>
        /// (Integer) An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. The default behavior is that unsuccessful runs are immediately retried.
        /// </summary>
        [Input("minRetryIntervalMillis")]
        public Input<int>? MinRetryIntervalMillis { get; set; }

        /// <summary>
        /// An optional name for the job. The default value is Untitled.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Same set of parameters as for databricks.Cluster resource.
        /// </summary>
        [Input("newCluster")]
        public Input<Inputs.JobNewClusterGetArgs>? NewCluster { get; set; }

        [Input("notebookTask")]
        public Input<Inputs.JobNotebookTaskGetArgs>? NotebookTask { get; set; }

        [Input("pipelineTask")]
        public Input<Inputs.JobPipelineTaskGetArgs>? PipelineTask { get; set; }

        [Input("pythonWheelTask")]
        public Input<Inputs.JobPythonWheelTaskGetArgs>? PythonWheelTask { get; set; }

        /// <summary>
        /// (Bool) An optional policy to specify whether to retry a job when it times out. The default behavior is to not retry on timeout.
        /// </summary>
        [Input("retryOnTimeout")]
        public Input<bool>? RetryOnTimeout { get; set; }

        /// <summary>
        /// (List) An optional periodic schedule for this job. The default behavior is that the job runs when triggered by clicking Run Now in the Jobs UI or sending an API request to runNow. This field is a block and is documented below.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.JobScheduleGetArgs>? Schedule { get; set; }

        [Input("sparkJarTask")]
        public Input<Inputs.JobSparkJarTaskGetArgs>? SparkJarTask { get; set; }

        [Input("sparkPythonTask")]
        public Input<Inputs.JobSparkPythonTaskGetArgs>? SparkPythonTask { get; set; }

        [Input("sparkSubmitTask")]
        public Input<Inputs.JobSparkSubmitTaskGetArgs>? SparkSubmitTask { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// (Map) An optional map of the tags associated with the job. Specified tags will be used as cluster tags for job clusters.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        [Input("tasks")]
        private InputList<Inputs.JobTaskGetArgs>? _tasks;
        public InputList<Inputs.JobTaskGetArgs> Tasks
        {
            get => _tasks ?? (_tasks = new InputList<Inputs.JobTaskGetArgs>());
            set => _tasks = value;
        }

        /// <summary>
        /// (Integer) An optional timeout applied to each run of this job. The default behavior is to have no timeout.
        /// </summary>
        [Input("timeoutSeconds")]
        public Input<int>? TimeoutSeconds { get; set; }

        /// <summary>
        /// URL of the Git repository to use.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        /// <summary>
        /// (List) An optional set of system destinations (for example, webhook destinations or Slack) to be notified when runs of this job begins, completes and fails. The default behavior is to not send any notifications. This field is a block and is documented below.
        /// </summary>
        [Input("webhookNotifications")]
        public Input<Inputs.JobWebhookNotificationsGetArgs>? WebhookNotifications { get; set; }

        public JobState()
        {
        }
        public static new JobState Empty => new JobState();
    }
}
