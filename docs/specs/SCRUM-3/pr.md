# [SCRUM-3] Publish domain events to Redpanda — wallet-contracts

## Changes
- Added Avro schemas for all 4 domain events: `WalletCreated`, `MoneyDeposited`, `MoneyWithdrawn`, `WithdrawRejected`
- Added `CloudEventEnvelope` Avro schema defining the CloudEvents 1.0 wrapper format
- Schemas located at `src/main/avro/com/jetledger/wallet/event/`

## Cross-references
- wallet-core: PR URL TBD
- wallet-analytics: PR URL TBD

## Validation
- Schemas define canonical contract for wallet.transactions.v1 topic
- Avro schemas compatible with Redpanda Schema Registry
