// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobSparkJarTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("jarUri")]
        public Input<string>? JarUri { get; set; }

        /// <summary>
        /// The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
        /// </summary>
        [Input("mainClassName")]
        public Input<string>? MainClassName { get; set; }

        [Input("parameters")]
        private InputList<string>? _parameters;

        /// <summary>
        /// (List) Parameters passed to the main method.
        /// </summary>
        public InputList<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<string>());
            set => _parameters = value;
        }

        public JobSparkJarTaskArgs()
        {
        }
        public static new JobSparkJarTaskArgs Empty => new JobSparkJarTaskArgs();
    }
}
