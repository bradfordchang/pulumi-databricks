// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterDatetimeRangeRangeArgs : global::Pulumi.ResourceArgs
    {
        [Input("end", required: true)]
        public Input<string> End { get; set; } = null!;

        [Input("start", required: true)]
        public Input<string> Start { get; set; } = null!;

        public SqlQueryParameterDatetimeRangeRangeArgs()
        {
        }
        public static new SqlQueryParameterDatetimeRangeRangeArgs Empty => new SqlQueryParameterDatetimeRangeRangeArgs();
    }
}
