// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterDatetimesecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The default value for this parameter.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public SqlQueryParameterDatetimesecArgs()
        {
        }
        public static new SqlQueryParameterDatetimesecArgs Empty => new SqlQueryParameterDatetimesecArgs();
    }
}
