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
    public sealed class SqlAlertOptions
    {
        /// <summary>
        /// Name of column in the query result to compare in alert evaluation.
        /// </summary>
        public readonly string Column;
        /// <summary>
        /// Custom body of alert notification, if it exists. See [Alerts API reference](https://docs.databricks.com/sql/user/alerts/index.html) for custom templating instructions.
        /// </summary>
        public readonly string? CustomBody;
        /// <summary>
        /// Custom subject of alert notification, if it exists. This includes email subject, Slack notification header, etc. See [Alerts API reference](https://docs.databricks.com/sql/user/alerts/index.html) for custom templating instructions.
        /// </summary>
        public readonly string? CustomSubject;
        /// <summary>
        /// Whether or not the alert is muted. If an alert is muted, it will not notify users and alert destinations when triggered.
        /// </summary>
        public readonly bool? Muted;
        /// <summary>
        /// Operator used to compare in alert evaluation. (Enum: `&gt;`, `&gt;=`, `&lt;`, `&lt;=`, `==`, `!=`)
        /// </summary>
        public readonly string Op;
        /// <summary>
        /// Value used to compare in alert evaluation.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private SqlAlertOptions(
            string column,

            string? customBody,

            string? customSubject,

            bool? muted,

            string op,

            string value)
        {
            Column = column;
            CustomBody = customBody;
            CustomSubject = customSubject;
            Muted = muted;
            Op = op;
            Value = value;
        }
    }
}
