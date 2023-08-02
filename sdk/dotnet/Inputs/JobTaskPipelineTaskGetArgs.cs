// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskPipelineTaskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Bool) Specifies if there should be full refresh of the pipeline.
        /// 
        /// &gt; **Note** The following configuration blocks are only supported inside a `task` block
        /// </summary>
        [Input("fullRefresh")]
        public Input<bool>? FullRefresh { get; set; }

        /// <summary>
        /// The pipeline's unique ID.
        /// </summary>
        [Input("pipelineId", required: true)]
        public Input<string> PipelineId { get; set; } = null!;

        public JobTaskPipelineTaskGetArgs()
        {
        }
        public static new JobTaskPipelineTaskGetArgs Empty => new JobTaskPipelineTaskGetArgs();
    }
}
