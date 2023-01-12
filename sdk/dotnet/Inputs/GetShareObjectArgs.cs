// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetShareObjectInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("addedAt", required: true)]
        public Input<int> AddedAt { get; set; } = null!;

        [Input("addedBy", required: true)]
        public Input<string> AddedBy { get; set; } = null!;

        /// <summary>
        /// Description about the object.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Type of the object.
        /// </summary>
        [Input("dataObjectType", required: true)]
        public Input<string> DataObjectType { get; set; } = null!;

        /// <summary>
        /// The name of the share
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("sharedAs", required: true)]
        public Input<string> SharedAs { get; set; } = null!;

        public GetShareObjectInputArgs()
        {
        }
        public static new GetShareObjectInputArgs Empty => new GetShareObjectInputArgs();
    }
}