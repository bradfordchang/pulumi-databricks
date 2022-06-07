// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class PipelineClusterInitScriptGetArgs : Pulumi.ResourceArgs
    {
        [Input("dbfs")]
        public Input<Inputs.PipelineClusterInitScriptDbfsGetArgs>? Dbfs { get; set; }

        [Input("file")]
        public Input<Inputs.PipelineClusterInitScriptFileGetArgs>? File { get; set; }

        [Input("gcs")]
        public Input<Inputs.PipelineClusterInitScriptGcsGetArgs>? Gcs { get; set; }

        [Input("s3")]
        public Input<Inputs.PipelineClusterInitScriptS3GetArgs>? S3 { get; set; }

        public PipelineClusterInitScriptGetArgs()
        {
        }
    }
}
