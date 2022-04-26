// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class TableColumnGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// User-visible name of column
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Whether field is nullable (Default: `true`)
        /// </summary>
        [Input("nullable")]
        public Input<bool>? Nullable { get; set; }

        /// <summary>
        /// Partition ID
        /// </summary>
        [Input("partitionIndex")]
        public Input<int>? PartitionIndex { get; set; }

        /// <summary>
        /// Ordinal position of column, starting at 0.
        /// </summary>
        [Input("position", required: true)]
        public Input<int> Position { get; set; } = null!;

        /// <summary>
        /// Format of `INTERVAL` columns
        /// </summary>
        [Input("typeIntervalType")]
        public Input<string>? TypeIntervalType { get; set; }

        /// <summary>
        /// Column type spec (with metadata) as JSON string
        /// </summary>
        [Input("typeJson")]
        public Input<string>? TypeJson { get; set; }

        /// <summary>
        /// Name of (outer) type
        /// </summary>
        [Input("typeName", required: true)]
        public Input<string> TypeName { get; set; } = null!;

        /// <summary>
        /// Digits of precision; applies to `DECIMAL` columns
        /// </summary>
        [Input("typePrecision")]
        public Input<int>? TypePrecision { get; set; }

        /// <summary>
        /// Digits to right of decimal; applies to `DECIMAL` columns
        /// </summary>
        [Input("typeScale")]
        public Input<int>? TypeScale { get; set; }

        /// <summary>
        /// Column type spec (with metadata) as SQL text
        /// </summary>
        [Input("typeText", required: true)]
        public Input<string> TypeText { get; set; } = null!;

        public TableColumnGetArgs()
        {
        }
    }
}