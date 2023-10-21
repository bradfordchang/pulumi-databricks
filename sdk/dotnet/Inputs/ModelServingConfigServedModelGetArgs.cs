// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ModelServingConfigServedModelGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("environmentVars")]
        private InputMap<object>? _environmentVars;

        /// <summary>
        /// a map of environment variable name/values that will be used for serving this model.  Environment variables may refer to Databricks secrets using the standard syntax: `{{secrets/secret_scope/secret_key}}`.
        /// </summary>
        public InputMap<object> EnvironmentVars
        {
            get => _environmentVars ?? (_environmentVars = new InputMap<object>());
            set => _environmentVars = value;
        }

        /// <summary>
        /// ARN of the instance profile that the served model will use to access AWS resources.
        /// </summary>
        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        /// <summary>
        /// The name of the model in Databricks Model Registry to be served.
        /// </summary>
        [Input("modelName", required: true)]
        public Input<string> ModelName { get; set; } = null!;

        /// <summary>
        /// The version of the model in Databricks Model Registry to be served.
        /// </summary>
        [Input("modelVersion", required: true)]
        public Input<string> ModelVersion { get; set; } = null!;

        /// <summary>
        /// The name of a served model. It must be unique across an endpoint. If not specified, this field will default to `modelname-modelversion`. A served model name can consist of alphanumeric characters, dashes, and underscores.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Whether the compute resources for the served model should scale down to zero. If scale-to-zero is enabled, the lower bound of the provisioned concurrency for each workload size will be 0. The default value is `true`.
        /// </summary>
        [Input("scaleToZeroEnabled")]
        public Input<bool>? ScaleToZeroEnabled { get; set; }

        /// <summary>
        /// The workload size of the served model. The workload size corresponds to a range of provisioned concurrency that the compute will autoscale between. A single unit of provisioned concurrency can process one request at a time. Valid workload sizes are "Small" (4 - 4 provisioned concurrency), "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64 provisioned concurrency).
        /// </summary>
        [Input("workloadSize", required: true)]
        public Input<string> WorkloadSize { get; set; } = null!;

        /// <summary>
        /// The workload type of the served model. The workload type selects which type of compute to use in the endpoint. For deep learning workloads, GPU acceleration is available by selecting workload types like `GPU_SMALL` and others. See documentation for all options. The default value is `CPU`.
        /// </summary>
        [Input("workloadType")]
        public Input<string>? WorkloadType { get; set; }

        public ModelServingConfigServedModelGetArgs()
        {
        }
        public static new ModelServingConfigServedModelGetArgs Empty => new ModelServingConfigServedModelGetArgs();
    }
}
