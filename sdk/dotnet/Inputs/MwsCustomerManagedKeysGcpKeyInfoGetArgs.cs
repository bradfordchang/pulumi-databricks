// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsCustomerManagedKeysGcpKeyInfoGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("kmsKeyId", required: true)]
        public Input<string> KmsKeyId { get; set; } = null!;

        public MwsCustomerManagedKeysGcpKeyInfoGetArgs()
        {
        }
        public static new MwsCustomerManagedKeysGcpKeyInfoGetArgs Empty => new MwsCustomerManagedKeysGcpKeyInfoGetArgs();
    }
}
