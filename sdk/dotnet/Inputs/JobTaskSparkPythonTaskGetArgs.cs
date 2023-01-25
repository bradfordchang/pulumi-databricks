// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskSparkPythonTaskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters")]
        private InputList<string>? _parameters;

        /// <summary>
        /// (List) Command line parameters passed to the Python file.
        /// </summary>
        public InputList<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`) and workspace paths are supported. For python files stored in the Databricks workspace, the path must be absolute and begin with `/Repos`. This field is required.
        /// </summary>
        [Input("pythonFile", required: true)]
        public Input<string> PythonFile { get; set; } = null!;

        public JobTaskSparkPythonTaskGetArgs()
        {
        }
        public static new JobTaskSparkPythonTaskGetArgs Empty => new JobTaskSparkPythonTaskGetArgs();
    }
}
