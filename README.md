# JavaCro 2026 - Frederik Pietzko

Slides for my two talks at JavaCro 2026, built with [Slidev](https://sli.dev).

| Talk | Slides | Source |
| --- | --- | --- |
| Ditch Python and build Enterprise-Ready AI Agents on the JVM with Koog | [Open slides](https://frederikpietzko.github.io/26-javacro/koog/) | [`koog/`](koog) |
| Java is Coming for Python's Lunch - The Rise of JVM AI Agents | [Open slides](https://frederikpietzko.github.io/26-javacro/the-rise-of-jvm-agents/) | [`the-rise-of-jvm-agents/`](the-rise-of-jvm-agents) |

All talks: <https://frederikpietzko.github.io/26-javacro/>

## Running locally

```bash
cd koog # or the-rise-of-jvm-agents
pnpm install
pnpm dev
```

## Deployment

Every push to `main` builds both decks and publishes them to GitHub Pages via
[`.github/workflows/deploy.yml`](.github/workflows/deploy.yml).
