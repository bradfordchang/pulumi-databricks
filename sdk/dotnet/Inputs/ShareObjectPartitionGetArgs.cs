// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ShareObjectPartitionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("values", required: true)]
        private InputList<Inputs.ShareObjectPartitionValueGetArgs>? _values;
        public InputList<Inputs.ShareObjectPartitionValueGetArgs> Values
        {
            get => _values ?? (_values = new InputList<Inputs.ShareObjectPartitionValueGetArgs>());
            set => _values = value;
        }

        public ShareObjectPartitionGetArgs()
        {
        }
        public static new ShareObjectPartitionGetArgs Empty => new ShareObjectPartitionGetArgs();
    }
}