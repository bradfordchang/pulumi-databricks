// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ModelServingConfigServedModel
    {
        /// <summary>
        /// a map of environment variable name/values that will be used for serving this model.  Environment variables may refer to Databricks secrets using the standard syntax: `{{secrets/secret_scope/secret_key}}`.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? EnvironmentVars;
        /// <summary>
        /// ARN of the instance profile that the served model will use to access AWS resources.
        /// </summary>
        public readonly string? InstanceProfileArn;
        /// <summary>
        /// The name of the model in Databricks Model Registry to be served.
        /// </summary>
        public readonly string ModelName;
        /// <summary>
        /// The version of the model in Databricks Model Registry to be served.
        /// </summary>
        public readonly string ModelVersion;
        /// <summary>
        /// The name of a served model. It must be unique across an endpoint. If not specified, this field will default to `modelname-modelversion`. A served model name can consist of alphanumeric characters, dashes, and underscores.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Whether the compute resources for the served model should scale down to zero. If scale-to-zero is enabled, the lower bound of the provisioned concurrency for each workload size will be 0. The default value is `true`.
        /// </summary>
        public readonly bool? ScaleToZeroEnabled;
        /// <summary>
        /// The workload size of the served model. The workload size corresponds to a range of provisioned concurrency that the compute will autoscale between. A single unit of provisioned concurrency can process one request at a time. Valid workload sizes are "Small" (4 - 4 provisioned concurrency), "Medium" (8 - 16 provisioned concurrency), and "Large" (16 - 64 provisioned concurrency).
        /// </summary>
        public readonly string WorkloadSize;
        /// <summary>
        /// The workload type of the served model. The workload type selects which type of compute to use in the endpoint. For deep learning workloads, GPU acceleration is available by selecting workload types like `GPU_SMALL` and others. See documentation for all options. The default value is `CPU`.
        /// </summary>
        public readonly string? WorkloadType;

        [OutputConstructor]
        private ModelServingConfigServedModel(
            ImmutableDictionary<string, object>? environmentVars,

            string? instanceProfileArn,

            string modelName,

            string modelVersion,

            string? name,

            bool? scaleToZeroEnabled,

            string workloadSize,

            string? workloadType)
        {
            EnvironmentVars = environmentVars;
            InstanceProfileArn = instanceProfileArn;
            ModelName = modelName;
            ModelVersion = modelVersion;
            Name = name;
            ScaleToZeroEnabled = scaleToZeroEnabled;
            WorkloadSize = workloadSize;
            WorkloadType = workloadType;
        }
    }
}
