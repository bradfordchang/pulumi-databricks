// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsNewClusterInitScriptS3Args : global::Pulumi.InvokeArgs
    {
        [Input("cannedAcl")]
        public string? CannedAcl { get; set; }

        [Input("destination", required: true)]
        public string Destination { get; set; } = null!;

        [Input("enableEncryption")]
        public bool? EnableEncryption { get; set; }

        [Input("encryptionType")]
        public string? EncryptionType { get; set; }

        [Input("endpoint")]
        public string? Endpoint { get; set; }

        [Input("kmsKey")]
        public string? KmsKey { get; set; }

        [Input("region")]
        public string? Region { get; set; }

        public GetJobJobSettingsSettingsNewClusterInitScriptS3Args()
        {
        }
        public static new GetJobJobSettingsSettingsNewClusterInitScriptS3Args Empty => new GetJobJobSettingsSettingsNewClusterInitScriptS3Args();
    }
}
