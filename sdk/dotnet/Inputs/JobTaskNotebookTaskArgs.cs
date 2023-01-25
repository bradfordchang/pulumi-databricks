// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskNotebookTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("baseParameters")]
        private InputMap<object>? _baseParameters;

        /// <summary>
        /// (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
        /// </summary>
        public InputMap<object> BaseParameters
        {
            get => _baseParameters ?? (_baseParameters = new InputMap<object>());
            set => _baseParameters = value;
        }

        /// <summary>
        /// The path of the databricks.Notebook to be run in the Databricks workspace or remote repository. For notebooks stored in the Databricks workspace, the path must be absolute and begin with a slash. For notebooks stored in a remote repository, the path must be relative. This field is required.
        /// </summary>
        [Input("notebookPath", required: true)]
        public Input<string> NotebookPath { get; set; } = null!;

        /// <summary>
        /// Location type of the notebook, can only be `WORKSPACE` or `GIT`. When set to `WORKSPACE`, the notebook will be retrieved from the local Databricks workspace. When set to `GIT`, the notebook will be retrieved from a Git repository defined in git_source. If the value is empty, the task will use `GIT` if `git_source` is defined and `WORKSPACE` otherwise.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        public JobTaskNotebookTaskArgs()
        {
        }
        public static new JobTaskNotebookTaskArgs Empty => new JobTaskNotebookTaskArgs();
    }
}
